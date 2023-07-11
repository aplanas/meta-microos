SUMMARY = "The Tilde Toolkit's window-based terminal program library"
DESCRIPTION = "libt3window library provides functions for manipulating the terminal \
and for creating (possibly overlapping) windows on a terminal. \
libt3window can be used instead of (n)curses for drawing on the \
terminal."
LICENSE = "GPL-3.0-only"

PV = "0.4.1"

RPM_NAME = "libt3window0-0.4.1-1.6.aarch64.rpm"
RPM_HASH = "7800e0b62ac70fbac3b6b8231596ce32a4b3771a00458d6714a614709e3161e3478c78760620017366d90f6bae1865ed71c3c6815ee3380f928f192b20e2953a"

RPROVIDES:${PN} += "libt3window.so.0 \
libt3window0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libtinfo.so.6 \
libtranscript.so.1 \
libunistring.so.5"

inherit rpm
