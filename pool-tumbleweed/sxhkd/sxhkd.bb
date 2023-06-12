SUMMARY = "Simple X hotkey daemon"
DESCRIPTION = "sxhkd is a simple X hotkey daemon with a powerful and compact configuration syntax."
LICENSE = "BSD-2-Clause"

PV = "0.6.2"

RPM_NAME = "sxhkd-0.6.2-1.9.aarch64.rpm"
RPM_HASH = "5c44112ee5de964bc3196276c0d14e0cfa2b6626ed1fe7800cf3fc6d8c874440895ad2bb68cfae6b1d30fc8859b096389585acb0adb017f650ccd19b40d8569d"

RPROVIDES:${PN} += "config(sxhkd) \
sxhkd \
sxhkd(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libxcb-keysyms.so.1()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
