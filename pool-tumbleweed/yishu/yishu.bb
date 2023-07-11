SUMMARY = "A bespoke and simple Todo.txt client"
DESCRIPTION = "Write a to-do list that will be easy to sync with most known Todo.txt clients."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.5"

RPM_NAME = "yishu-1.2.5-1.17.aarch64.rpm"
RPM_HASH = "aa2ad27c9993e953e55f4b0aaf69428a94e4e1fa904d2d6eef0e1e09dd5641fa80503bcaeb9f413008a8d43703cdf04cb56752ee88a29a94d2c0e38a08ac699c"

RPROVIDES:${PN} += "yishu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0"

inherit rpm
