SUMMARY = "The Tilde Toolkit's syntax highlighting library"
DESCRIPTION = "libt3highlight is a library that provides functions for syntax \
highlighting different types of text files."
LICENSE = "GPL-3.0-only"

PV = "0.5.0"

RPM_NAME = "libt3highlight2-0.5.0-1.15.aarch64.rpm"
RPM_HASH = "eceb52e175b23e7aa7f0aba14b82d1ccdfbce8410694e81b83c17c6de6d2b701c8d99811e4ee4fc0c8d63a5d14328d04e66258d4c5e5c90762ae6fefcfc0ff34"

RPROVIDES:${PN} += "libt3highlight.so.2()(64bit) \
libt3highlight2 \
libt3highlight2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpcre2-8.so.0()(64bit) \
libt3config.so.0()(64bit)"

inherit rpm
