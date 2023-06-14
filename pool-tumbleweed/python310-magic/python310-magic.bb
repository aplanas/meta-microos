SUMMARY = "Python module to use libmagic"
DESCRIPTION = "This package contains the Python binding that require the magic 'file' \
interface."
LICENSE = "BSD-3-Clause & BSD-4-Clause"

PV = "5.44"

RPM_NAME = "python310-magic-5.44-2.1.aarch64.rpm"
RPM_HASH = "e847f9dae849af3d319f0603fca967e03e5c0ae33bab82a59d2d68cbcd3722856f16dd0bdf2c09195b386ca87e70d0c7799e399b9ea189f70080fc143bcaf150"

RPROVIDES:${PN} += "python3-file-magic \
python3-magic \
python3.10dist-file-magic \
python310-file-magic \
python310-magic \
python3dist-file-magic"

RDEPENDS:${PN} += "libmagic1 \
python-abi"

inherit rpm
