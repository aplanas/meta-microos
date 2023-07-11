SUMMARY = "The Tilde Toolkit's syntax highlighting library"
DESCRIPTION = "libt3highlight is a library that provides functions for syntax \
highlighting different types of text files."
LICENSE = "GPL-3.0-only"

PV = "0.5.0"

RPM_NAME = "libt3highlight2-0.5.0-1.16.aarch64.rpm"
RPM_HASH = "13268c9376de7ae2df8ec51834b0ebafb2da83c5d1c67dad17b92da48cd69ec4d5a57485af5a4afbe01427e17bde0979498630ffdb8e3b870cc77d6992621ecc"

RPROVIDES:${PN} += "libt3highlight.so.2 \
libt3highlight2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre2-8.so.0 \
libt3config.so.0"

inherit rpm
