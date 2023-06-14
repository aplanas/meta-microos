SUMMARY = "A Tool for Mirroring FTP and HTTP Servers"
DESCRIPTION = "Wget enables you to retrieve WWW documents or FTP files from a server. \
This can be done in script files or via the command line."
LICENSE = "GPL-3.0-or-later"

PV = "1.21.4"

RPM_NAME = "wget-1.21.4-1.1.aarch64.rpm"
RPM_HASH = "c4805aa84876eb820800337a04fb7c85769f5803a41aea83a90d8842a717c084db17aa26caddf139d58f1bf6a3b491dcf1d25e735e581188a9c26dd2724efa83"

RPROVIDES:${PN} += "config-wget \
wget"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcares.so.2 \
libcrypto.so.3 \
libgpgme.so.11 \
libidn2.so.0 \
libmetalink.so.3 \
libpcre2-8.so.0 \
libproxy.so.1 \
libpsl.so.5 \
libssl.so.3 \
libuuid.so.1 \
libz.so.1"

inherit rpm
