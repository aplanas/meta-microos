SUMMARY = "Deepin-pw-check libraries"
DESCRIPTION = "This package contains the libraries for IBus"
LICENSE = "GPL-3.0+"

PV = "5.1.16"

RPM_NAME = "libdeepin_pw_check1-5.1.16-1.5.aarch64.rpm"
RPM_HASH = "6fe88dea7f6acd28901e5b71800e7cab691029cc4c8980c9531497a63e6ff4125865e9bb439b56d18e7a468320c5cd917cc409adc15a53c6255fcd70cec2dcc8"

RPROVIDES:${PN} += "libdeepin_pw_check.so.1()(64bit) \
libdeepin_pw_check1 \
libdeepin_pw_check1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrack.so.2()(64bit) \
libcrypt.so.1()(64bit) \
libiniparser.so.1()(64bit)"

inherit rpm
