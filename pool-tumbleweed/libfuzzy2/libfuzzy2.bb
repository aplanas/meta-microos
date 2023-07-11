SUMMARY = "API for ssdeep"
DESCRIPTION = "Libraries for ssdeep, the primary library is libfuzzy.*"
LICENSE = "GPL-2.0 & GPL-2.0+"

PV = "2.14.1"

RPM_NAME = "libfuzzy2-2.14.1-1.24.aarch64.rpm"
RPM_HASH = "646c687efc773923649a57d32d22f65d58f98c1c8921a3270dd188026f7520cc31cf0c622aacda67019209c2b4ac03abd02cd5ce61f87afa0a9ecf4ed7de900c"

RPROVIDES:${PN} += "libfuzzy.so.2 \
libfuzzy2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
