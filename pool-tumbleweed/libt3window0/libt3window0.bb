SUMMARY = "The Tilde Toolkit's window-based terminal program library"
DESCRIPTION = "libt3window library provides functions for manipulating the terminal \
and for creating (possibly overlapping) windows on a terminal. \
libt3window can be used instead of (n)curses for drawing on the \
terminal."
LICENSE = "GPL-3.0-only"

PV = "0.4.1"

RPM_NAME = "libt3window0-0.4.1-1.5.aarch64.rpm"
RPM_HASH = "65fb00dec2dcef0414fd1b9fa26d81bb419892ee940aa86faae3125a926fcb2e6d3b5e2e4c77aaf41e7fe6bcbd6f7624a29455800a097728f8f8fca1dfc77734"

RPROVIDES:${PN} += "libt3window.so.0()(64bit) \
libt3window0 \
libt3window0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libtinfo.so.6()(64bit) \
libtranscript.so.1()(64bit) \
libunistring.so.5()(64bit)"

inherit rpm
