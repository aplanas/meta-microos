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
telepathy-sipe \
telepathy-sipe(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdbus-glib-1.so.2()(64bit) \
libfreerdp-shadow-subsystem2.so.2()(64bit) \
libfreerdp-shadow2.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmime-3.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libsmime3.so()(64bit) \
libtelepathy-glib.so.0()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
