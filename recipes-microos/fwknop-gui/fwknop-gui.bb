SUMMARY = "FireWall KNock OPerator Graphical User Interface"
DESCRIPTION = "The FireWall KNock OPerator implements an authorization scheme called \
Single Packet Authorization (SPA), based on Netfilter and libpcap. \
 \
Its main application is to protect services such as OpenSSH with an \
additional layer of security in order to make the exploitation of \
vulnerabilities (both 0-day and unpatched code) much more difficult. \
 \
Fwknop GUI is a graphical user interface integrated with an Fwknop \
client that provides the ability to send SPA packets to a remote \
Fwknop server, as well as a front-end for creating and managing client \
configurations for multiple Fwknop servers. \
 \
It supports exporting saved configuration data to a QR code format \
readable by the Android client, as well as to the .fwknoprc format \
readable by the command line client."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "fwknop-gui-1.3.1-1.4.aarch64.rpm"
RPM_HASH = "0c2d22e97ffd729d01fefdb61c54d7ae6dbd29844b7e0a0171eef42b9d96b3f86c1674574c5dc190692a5ec69addb96786aebabae318b3a981a6cb980a231536"

RPROVIDES:${PN} += "application() application(fwknop-gui.desktop) fwknop-gui fwknop-gui(aarch-64) metainfo() metainfo(fwknop-gui.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcurl.so.4()(64bit) libfko.so.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgpgme.so.11()(64bit) libgpgme.so.11(GPGME_1.0)(64bit) libgpgme.so.11(GPGME_1.1)(64bit) libqrencode.so.4()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_baseu_net-suse.so.9.0.0()(64bit) libwx_baseu_net-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk2u_core-suse.so.9.0.0()(64bit) libwx_gtk2u_core-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk2u_html-suse.so.9.0.0()(64bit) libwx_gtk2u_html-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
