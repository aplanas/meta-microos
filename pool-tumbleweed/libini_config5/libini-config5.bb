SUMMARY = "INI file parser for C"
DESCRIPTION = "Library to process config files in INI format into a libcollection data \
structure"
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "libini_config5-1.3.1-28.1.aarch64.rpm"
RPM_HASH = "33e3c0d1139dc64c5249557ac5d14ffc16ef83abd492ca620686286544bdda011269dfc277d342049d31dad6d3dacb6a64545d4f05285c763dfd4e865026334f"

RPROVIDES:${PN} += "libini-config.so.5 \
libini-config5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbasicobjects.so.0 \
libc.so.6 \
libcollection.so.4 \
libpath-utils.so.1 \
libref-array.so.1"

inherit rpm
