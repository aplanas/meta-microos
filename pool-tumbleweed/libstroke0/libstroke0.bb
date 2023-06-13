SUMMARY = "A Stroke Translation Library"
DESCRIPTION = "LibStroke is a stroke interface library.  Strokes are motions of the \
mouse that can be interpreted by a program as a command.  Strokes are \
used extensively in CAD programs."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.1"

RPM_NAME = "libstroke0-0.5.1-234.3.aarch64.rpm"
RPM_HASH = "b06f4c38d5e55d55634ed30d27313d0cb26093c68e2217b56e5df3c89edc3f140e536837da08bcd36d5be99999ba5277e775e2c3477ca623d077e411519d95fb"

RPROVIDES:${PN} += "libstroke \
libstroke.so.0()(64bit) \
libstroke0 \
libstroke0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
