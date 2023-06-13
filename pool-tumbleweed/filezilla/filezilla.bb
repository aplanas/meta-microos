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

RPROVIDES:${PN} += "application() \
application(filezilla.desktop) \
filezilla \
filezilla(aarch-64) \
libfzclient-commonui-private-3.64.0.so()(64bit) \
libfzclient-private-3.64.0.so()(64bit) \
metainfo() \
metainfo(filezilla.appdata.xml)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libfilezilla.so.36()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libnettle.so.8()(64bit) \
libnettle.so.8(NETTLE_8)(64bit) \
libpugixml.so.1()(64bit) \
libpugixml1 \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.7)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk2u_aui-suse.so.9.0.0()(64bit) \
libwx_gtk2u_aui-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk2u_core-suse.so.9.0.0()(64bit) \
libwx_gtk2u_core-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk2u_xrc-suse.so.9.0.0()(64bit) \
libwx_gtk2u_xrc-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
