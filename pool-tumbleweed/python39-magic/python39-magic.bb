SUMMARY = "Python module to use libmagic"
DESCRIPTION = "This package contains the Python binding that require the magic 'file' \
interface."
LICENSE = "BSD-3-Clause & BSD-4-Clause"

PV = "5.44"

RPM_NAME = "python39-magic-5.44-2.3.aarch64.rpm"
RPM_HASH = "fdeb97f225ce393220210a567473f5d3b650fe66e139e0b42b990330b66ca564649835c768614eb1fa937f8db09b206e87b39d4b87f7318c3193369ea6e4b390"

RPROVIDES:${PN} += "python3.9dist-file-magic \
python39-file-magic \
python39-magic \
python3dist-file-magic"

RDEPENDS:${PN} += "libmagic1 \
python-abi"

inherit rpm
