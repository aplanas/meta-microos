SUMMARY = "A shared library for notmuch"
DESCRIPTION = "The libnotmuch3 package contains shared libraries for notmuch."
LICENSE = "GPL-3.0-or-later"

PV = "0.37"

RPM_NAME = "libnotmuch5-0.37-2.6.aarch64.rpm"
RPM_HASH = "11907fad5b258398cbcb20b09c55f941f1fe510df1bbc50598cbacebf6547c4641496ee9e594d999e7b8c2f466c380620e1dd9c5399cede118c4c3a5234eb6c5"

RPROVIDES:${PN} += "libnotmuch.so.5 \
libnotmuch5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgmime-3.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6 \
libtalloc.so.2 \
libxapian.so.30"

inherit rpm
