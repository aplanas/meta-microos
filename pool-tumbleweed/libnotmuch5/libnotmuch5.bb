SUMMARY = "A shared library for notmuch"
DESCRIPTION = "A global-search and tag-based email system which uses Xapian for indexing. \
 \
The libnotmuch5 package contains shared libraries for notmuch."
LICENSE = "GPL-3.0-or-later"

PV = "0.37"

RPM_NAME = "libnotmuch5-0.37-3.1.aarch64.rpm"
RPM_HASH = "809536ee5b0f17cd5dbe76f45bf5316514f2a16947b93f556b3b832c5ae3d3abec26a3fbaff422ddc46f0512bd4d824248079cab408dd56ebc71955d033fd26d"

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
