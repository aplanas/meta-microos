SUMMARY = "Android boot.img manipulation tools"
DESCRIPTION = "This package contains the Android boot.img manipulation tools."
LICENSE = "Apache-2.0 & MIT"

PV = "34.0.4"

RPM_NAME = "android-tools-mkbootimg-34.0.4-1.2.noarch.rpm"
RPM_HASH = "7fc9a72990273efc43d52e7ea4a5c4b0c6f409f7d776fa20e6d986487312b032357e70fb5fc1213e5f1512f292f822cb2fc9d159a74c7328413e1fc922145c23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "android-tools-mkbootimg"

RDEPENDS:${PN} += "/usr/bin/python3 \
android-tools"

inherit rpm
