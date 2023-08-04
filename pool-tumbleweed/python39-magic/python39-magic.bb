SUMMARY = "Python module to use libmagic"
DESCRIPTION = "This package contains the Python binding that require the magic 'file' \
interface."
LICENSE = "BSD-3-Clause & BSD-4-Clause"

PV = "5.45"

RPM_NAME = "python39-magic-5.45-1.1.aarch64.rpm"
RPM_HASH = "b16c13e0d994f07553000dcc251f95177b55a99ec41db975e20ea37502bdc18b0a50a2b2a89ee08f76236365b66d83eb7bead0e024ecd15291afc8e174abaf4f"

RPROVIDES:${PN} += "python3.9dist-file-magic \
python39-file-magic \
python39-magic \
python3dist-file-magic"

RDEPENDS:${PN} += "libmagic1 \
python-abi"

inherit rpm
