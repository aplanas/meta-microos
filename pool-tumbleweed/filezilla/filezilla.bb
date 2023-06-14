SUMMARY = "A GUI FTP and SFTP Client"
DESCRIPTION = "FileZilla is a modern and powerful FTP client. \
FileZilla development focuses on high usability while also \
supporting as many useful features as possible. \
 \
Some of the main features are: \
 * Continuing interrupted up-/downloads. \
 * Managing different FTP sites. \
 * Modifiable Commands. \
 * Keep-Alive-System. \
 * Timeout detection. \
 * Firewall support. \
 * SOCKS4/5 and HTTP 1.1 proxy support. \
 * SSL support (secure connections). \
 * SFTP support. \
 * Upload/Download queue. \
 * Drag&Drop support."
LICENSE = "GPL-2.0-or-later"

PV = "3.64.0"

RPM_NAME = "filezilla-3.64.0-1.1.aarch64.rpm"
RPM_HASH = "a96aa1e07ef8d3983d1354cd719791b258a21340f3139db75cfdedbecea76f10570c8fa38351022d3690feb49d606bcdc3a902ac9d853d91185f198592356750"

RPROVIDES:${PN} += "filezilla \
libfzclient-commonui-private-3.64.0.so \
libfzclient-private-3.64.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libfilezilla.so.36 \
libgcc-s.so.1 \
libgdk-x11-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libnettle.so.8 \
libpugixml.so.1 \
libpugixml1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk2u-aui-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0 \
libwx-gtk2u-xrc-suse.so.9.0.0"

inherit rpm
