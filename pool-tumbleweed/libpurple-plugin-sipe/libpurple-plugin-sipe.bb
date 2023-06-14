SUMMARY = "Libpurple third-party plugin for MS Skype for Business"
DESCRIPTION = "A third-party plugin for the libpurple multi-protocol instant \
messaging library. It implements the extended version of SIP/SIMPLE \
used by various products: \
 * Skype for Business. \
 * Microsoft Office 365. \
 * Microsoft Business Productivity Online Suite (BPOS). \
 * Microsoft Lync Server. \
 * Microsoft Office Communications Server (OCS 2007/2007 R2). \
 * Microsoft Live Communications Server (LCS 2003/2005). \
 * Reuters Messaging."
LICENSE = "GPL-2.0-or-later"

PV = "1.25.0"

RPM_NAME = "libpurple-plugin-sipe-1.25.0-2.10.aarch64.rpm"
RPM_HASH = "f3b583c9401fd4dd412ceef8900d9421f0d3dffa378cf91ee5d66b97c541550b6677a09321bd546878ad78c58f4b0d0258a05a808974049c91731ecb60da7941"

RPROVIDES:${PN} += "libpurple-plugin-sipe \
libsipe.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libfarstream-0.2.so.5 \
libfreerdp-shadow-subsystem2.so.2 \
libfreerdp-shadow2.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmime-3.0.so.0 \
libgobject-2.0.so.0 \
libgssapi-krb5.so.2 \
libgstreamer-1.0.so.0 \
libgstrtp-1.0.so.0 \
libnspr4.so \
libnss3.so \
libpurple.so.0 \
libsmime3.so \
libwinpr2.so.2 \
libxml2.so.2"

inherit rpm
