SUMMARY = "The Tilde terminal dialog toolkit"
DESCRIPTION = "The libt3widget library provides a C++ dialog toolkit. It provides \
objects for dialogs and widgets like buttons, text fields, check \
boxes etc., to facilitate easy construction of dialog based programs \
for Unix-type terminals."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "libt3widget2-1.2.2-1.6.aarch64.rpm"
RPM_HASH = "1ffefb44a0422e7ce4180d94958027835e78272ed312fdb65306328d65f46cbfef0cc2f599436f17612b6b5f72d1d73d86e8267b07ac1706cf1260da08f27cff"

RPROVIDES:${PN} += "libt3widget.so.2 \
libt3widget2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libgpm.so.2 \
libpcre2-8.so.0 \
libstdc++.so.6 \
libt3key.so.1 \
libt3window.so.0 \
libtranscript.so.1 \
libunistring.so.5"

inherit rpm
