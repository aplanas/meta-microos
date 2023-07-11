SUMMARY = "Talk Client for Chatting with Another User"
DESCRIPTION = "This package contains the talk client, which allows you to chat with \
another user on a different system. Talk is a communication program \
which copies lines from one terminal to that of another user."
LICENSE = "BSD-3-Clause"

PV = "0.17"

RPM_NAME = "talk-0.17-721.14.aarch64.rpm"
RPM_HASH = "39422e427e121c3206a204be852d1551938ae03bbf66605815914bd3b9c2e7e617c1854363f815b7461520b4164659fec14bdec81a0e2c3749ce7b7c1fd28e46"

RPROVIDES:${PN} += "nkitb-/usr/bin/talk \
talk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
