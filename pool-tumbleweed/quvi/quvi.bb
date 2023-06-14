SUMMARY = "Command line tool for parsing flash media stream URLs"
DESCRIPTION = "quvi is a command line tool for parsing flash media stream URLs. \
It supports many websites including YouTube and Dailymotion."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.5"

RPM_NAME = "quvi-0.9.5-5.8.aarch64.rpm"
RPM_HASH = "ccede7f394872c3960a92207e524415c2d7e4353e5b226190210484c486f1e00613b71ebf7de6e6b29bb72cc653bf042e216469193332b97aa6020a696378404"

RPROVIDES:${PN} += "quvi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libquvi-0.9-0.9.4.so \
libxml2.so.2"

inherit rpm
