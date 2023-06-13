SUMMARY = "API for ssdeep"
DESCRIPTION = "Libraries for ssdeep, the primary library is libfuzzy.*"
LICENSE = "GPL-2.0 & GPL-2.0+"

PV = "2.14.1"

RPM_NAME = "libfuzzy2-2.14.1-1.23.aarch64.rpm"
RPM_HASH = "88537e967dff5ff77ff810d06a3499cd357a9b3b8a293f92eba6dfc74d430381a1ebd1eaf612c504030d4b150ed35b0062222960f7ab71a368bd0984e3aa8a37"

RPROVIDES:${PN} += "libfuzzy.so.2()(64bit) \
libfuzzy2 \
libfuzzy2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
