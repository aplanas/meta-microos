SUMMARY = "A Tool for Mirroring FTP and HTTP Servers"
DESCRIPTION = "Wget enables you to retrieve WWW documents or FTP files from a server. \
This can be done in script files or via the command line."
LICENSE = "GPL-3.0-or-later"

PV = "1.21.4"

RPM_NAME = "wget-1.21.4-2.1.aarch64.rpm"
RPM_HASH = "1f0b369832aca99002cf5189c74df1b7a7f9219a384ae2cdf489c603e3447cb1ddaa202a00644da6e25468ebc843760b7d94e299c1cbf055b1f31fa506e49694"

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
