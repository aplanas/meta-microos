SUMMARY = "The Tilde terminal dialog toolkit"
DESCRIPTION = "The libt3widget library provides a C++ dialog toolkit. It provides \
objects for dialogs and widgets like buttons, text fields, check \
boxes etc., to facilitate easy construction of dialog based programs \
for Unix-type terminals."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "libt3widget2-1.2.2-1.5.aarch64.rpm"
RPM_HASH = "2db34fe815d98e099d94dc122a525ac2a3b324bd566735c7b5370a3aed481e99d81f46c991b30ebc7e2e2cd98858e67f78fa0554b2f3e20c12966a5200e37ece"

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
