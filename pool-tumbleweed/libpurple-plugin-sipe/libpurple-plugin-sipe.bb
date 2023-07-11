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

RPM_NAME = "libpurple-plugin-sipe-1.25.0-2.12.aarch64.rpm"
RPM_HASH = "79656f6b7c623c4b39fd36de0e3ef732840e738cf4e3cad961437bd105aa916f93b66870cc43bbf55f48bf373763674c0a843dbccd72f4de47976d8f1c9872cc"

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
