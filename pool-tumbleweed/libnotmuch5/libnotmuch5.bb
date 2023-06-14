SUMMARY = "A shared library for notmuch"
DESCRIPTION = "The libnotmuch3 package contains shared libraries for notmuch."
LICENSE = "GPL-3.0-or-later"

PV = "0.37"

RPM_NAME = "libnotmuch5-0.37-2.4.aarch64.rpm"
RPM_HASH = "fd57b761812bd429aee8924ebda8d816adcc851dacca8eee3e4769b69f8c3b406da1f02297f092d6a046c7631170add1052f26d1822648d03f490e4f3ab91f3b"

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
