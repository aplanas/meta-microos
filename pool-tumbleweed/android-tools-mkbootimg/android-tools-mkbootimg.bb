SUMMARY = "Android boot.img manipulation tools"
DESCRIPTION = "This package contains the Android boot.img manipulation tools."
LICENSE = "Apache-2.0 & MIT"

PV = "34.0.1"

RPM_NAME = "android-tools-mkbootimg-34.0.1-1.1.noarch.rpm"
RPM_HASH = "104edd8c2d15ef9585676c9c0f8be0dfccc6410f59031cd7dfaa03d7370a820d6ecb816719b62e6ba80486ca6b05408cd2fc81432ca1ef331f03275e6a8f7d2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "android-tools-mkbootimg"

RDEPENDS:${PN} += "/usr/bin/python3 \
android-tools \
python3"

inherit rpm
