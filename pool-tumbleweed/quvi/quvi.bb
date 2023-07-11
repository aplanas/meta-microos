SUMMARY = "Command line tool for parsing flash media stream URLs"
DESCRIPTION = "quvi is a command line tool for parsing flash media stream URLs. \
It supports many websites including YouTube and Dailymotion."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.5"

RPM_NAME = "quvi-0.9.5-5.9.aarch64.rpm"
RPM_HASH = "6b4aaeb6d693b6c8a4b7b361519d5067f482f9c6d8672ee9acf0008ee79a102b60a15dd20c4f9ca502ea17b486e9fef3d46a573d5969a91b9a0c26e7f4da66ea"

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
