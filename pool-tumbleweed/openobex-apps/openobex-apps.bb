SUMMARY = "Open Source Implementation of the Object Exchange (OBEX) Protocol"
DESCRIPTION = "Various applications and ools using the Object Exchange (OBEX) Protocol libraries."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.7.2"

RPM_NAME = "openobex-apps-1.7.2-3.4.aarch64.rpm"
RPM_HASH = "0fd7deca8a848b3109c8c5e3d354f4ca687493464075cbc402235f7ac70a69402ad868ccb5f636176c3390c8e788cf7750c246f11db381dafb57a3c5a3637d92"

RPROVIDES:${PN} += "openobex-apps \
openobex-apps(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libopenobex.so.2()(64bit)"

inherit rpm
