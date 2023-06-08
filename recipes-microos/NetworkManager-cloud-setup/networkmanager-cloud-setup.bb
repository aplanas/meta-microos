SUMMARY = "Automatically configure NetworkManager in cloud"
DESCRIPTION = "Installs a nm-cloud-setup tool that can automatically configure \
NetworkManager in cloud setups. Currently only EC2 is supported. \
This tool is still experimental."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.6"

RPM_NAME = "NetworkManager-cloud-setup-1.42.6-1.1.aarch64.rpm"
RPM_HASH = "fc837ed0238bd30362851c681ce14c63586045cb0a26b3e962472bfdfaa907241270c7043a94a15b350a415ee353dce429e54bc3e5afb33c3046b62d9fc0222a"

RPROVIDES:${PN} += "NetworkManager-cloud-setup NetworkManager-cloud-setup(aarch-64)"
RDEPENDS:${PN} += "/bin/sh NetworkManager ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcurl.so.4()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libnm.so.0()(64bit) libnm.so.0(libnm_1_0_0)(64bit) libnm.so.0(libnm_1_10_0)(64bit) libnm.so.0(libnm_1_18_0)(64bit) libnm.so.0(libnm_1_20_0)(64bit) libnm.so.0(libnm_1_22_0)(64bit) libnm.so.0(libnm_1_2_0)(64bit) libnm.so.0(libnm_1_32_0)(64bit) libnm.so.0(libnm_1_42_0)(64bit) libnm.so.0(libnm_1_8_0)(64bit) libnm0"

inherit rpm
