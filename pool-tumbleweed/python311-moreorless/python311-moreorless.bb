SUMMARY = "Python diff wrapper"
DESCRIPTION = "Python diff wrapper."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-moreorless-0.4.0-1.5.noarch.rpm"
RPM_HASH = "f72ff2d4ce224246a389f6d91a7dc39ea0227ad341f06fabf7cc8f79731244a35c08fbe5d2efc6949136d955aa4d9b7cf7711181188f9f170184ceebb7f5f806"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-moreorless \
python3.11dist-moreorless \
python311-moreorless \
python3dist-moreorless"

RDEPENDS:${PN} += "python-abi \
python311-click \
python311-volatile"

inherit rpm
