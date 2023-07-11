SUMMARY = "A replacement of the contextlib module"
DESCRIPTION = "Contexter is a full replacement of the contextlib standard library \
module."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "python39-contexter-0.1.4-2.15.noarch.rpm"
RPM_HASH = "3e3095bc02d89ca665f358228b8f73af9bd08c0285b113e9f91a004a869cbf816ce8b5f31fa433e7fb91a870e97c6919df2fd8799808bf5f6520be7b744890fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-contexter \
python39-contexter \
python3dist-contexter"

RDEPENDS:${PN} += "python-abi"

inherit rpm
