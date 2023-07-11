SUMMARY = "Android boot.img manipulation tools"
DESCRIPTION = "This package contains the Android boot.img manipulation tools."
LICENSE = "Apache-2.0 & MIT"

PV = "34.0.1"

RPM_NAME = "android-tools-mkbootimg-34.0.1-2.1.noarch.rpm"
RPM_HASH = "fee364701b9d398043f18afdea1e9ae99d4b88e425ee236509b1fa47589d52479877d08f9f8936d986369411e72d216ec3fd0befd8b041f32f6a776642b9c2d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "android-tools-mkbootimg"

RDEPENDS:${PN} += "/usr/bin/python3 \
android-tools \
python3"

inherit rpm
