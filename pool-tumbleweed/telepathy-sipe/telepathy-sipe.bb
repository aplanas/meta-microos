SUMMARY = "MS Skype for Business connection manager for Telepathy"
DESCRIPTION = "A third-party connection manager for the telepathy multi-protocol \
instant messaging core. It implements the extended version of \
SIP/SIMPLE used by various products: \
 * Skype for Business. \
 * Microsoft Office 365. \
 * Microsoft Business Productivity Online Suite (BPOS). \
 * Microsoft Lync Server. \
 * Microsoft Office Communications Server (OCS 2007/2007 R2). \
 * Microsoft Live Communications Server (LCS 2003/2005). \
 * Reuters Messaging."
LICENSE = "GPL-2.0-or-later"

PV = "1.25.0"

RPM_NAME = "telepathy-sipe-1.25.0-2.10.aarch64.rpm"
RPM_HASH = "3525bc604c65e70fdf6ad29fc5e88200ff1e3d877d302d203929be8834255e7444b92faa8f63e9c8a989220f1ff86546c34819df8416b552a73e0c01aaceca54"

RPROVIDES:${PN} += "telepathy-plugin-sipe \
telepathy-sipe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-glib-1.so.2 \
libfreerdp-shadow-subsystem2.so.2 \
libfreerdp-shadow2.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmime-3.0.so.0 \
libgobject-2.0.so.0 \
libgssapi-krb5.so.2 \
libnspr4.so \
libnss3.so \
libsmime3.so \
libtelepathy-glib.so.0 \
libxml2.so.2"

inherit rpm
