SUMMARY = "A patch parsing and application library"
DESCRIPTION = "A patch parsing and application library."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "python311-whatthepatch-1.0.3-1.6.noarch.rpm"
RPM_HASH = "a5766fa550a9eac7c217ba1dfaffc6b44c92da8969e1e69f67f72d1b6cf4a786cc42ff81acb84c433a678130a4bc31fc2a31d0164835d8ca8bcee00f278fa79f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-whatthepatch \
python3.11dist-whatthepatch \
python311-whatthepatch \
python3dist-whatthepatch"

RDEPENDS:${PN} += "ed \
patch \
python-abi"

inherit rpm
