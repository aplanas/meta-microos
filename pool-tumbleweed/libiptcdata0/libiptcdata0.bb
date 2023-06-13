SUMMARY = "IPTC Metadata Tag Manipulation Library"
DESCRIPTION = "libiptcdata is a library for parsing, editing, and saving \
International Press \
Telecommunications Council (IPTC) metadata stored within multimedia \
files such as images. This metadata can include captions and keywords, \
often used by popular photo management applications. The library \
provides routines for parsing, viewing, modifying, and saving this \
metadata. The libiptcdata package also includes a command line utility, \
iptc, for editing IPTC data in JPEG files. The library implements the \
IPTC Information Interchange Model according to its specification."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "libiptcdata0-1.0.5-1.10.aarch64.rpm"
RPM_HASH = "6f951c7f698ff0dd03c71ce121a09132ce0f3093843c3289d2bd0fae1450ddc12f42619ce46d31f0fc68fde7cdfd4985c0860d45211fc13bc69afe70bd461d85"

RPROVIDES:${PN} += "libiptcdata.so.0()(64bit) \
libiptcdata0 \
libiptcdata0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libiptcdata"

inherit rpm
