SUMMARY = "Python module to use libmagic"
DESCRIPTION = "This package contains the Python binding that require the magic 'file' \
interface."
LICENSE = "BSD-3-Clause & BSD-4-Clause"

PV = "5.44"

RPM_NAME = "python310-magic-5.44-2.3.aarch64.rpm"
RPM_HASH = "07c735db9a0e68401eaa8936f261fb5c6f1388f56d2d3aecf67a10e75579ccf1c3146527561429ac11f3e17786a49572e24b31364395f49bf9b8e5cf05990d02"

RPROVIDES:${PN} += "python3.10dist-file-magic \
python310-file-magic \
python310-magic \
python3dist-file-magic"

RDEPENDS:${PN} += "libmagic1 \
python-abi"

inherit rpm
