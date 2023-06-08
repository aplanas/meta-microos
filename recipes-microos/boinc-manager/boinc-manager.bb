SUMMARY = "GUI to control and monitor boinc-client"
DESCRIPTION = "The BOINC Manager is a graphical monitor and control utility for the BOINC \
core client. It gives a detailed overview of the state of the client it is \
monitoring. The BOINC Manager has two modes of operation, the 'Simple View' in \
which it only displays the most important information and the 'Advanced View' \
in which all information and all control elements are available."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "7.22.0"

RPM_NAME = "boinc-manager-7.22.0-1.4.aarch64.rpm"
RPM_HASH = "508768c79db73cf2baba6c3ab7048fce695a3a11b3977bb28d5a18d5439702903bea5e6ddd20a11a2e640bd53145d5b0b41c273747c98aac1951dfbc514a78cc"

RPROVIDES:${PN} += "application() application(boinc.desktop) boinc-manager boinc-manager(aarch-64)"
RDEPENDS:${PN} += "/bin/sh hicolor-icon-theme ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libboinc.so.7()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libnotify.so.4()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libwx_baseu-suse.so.3.0.5()(64bit) libwx_baseu-suse.so.3.0.5(WXU_3.0)(64bit) libwx_baseu_net-suse.so.3.0.5()(64bit) libwx_baseu_net-suse.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_adv-suse.so.3.0.5()(64bit) libwx_gtk2u_adv-suse.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_core-suse.so.3.0.5()(64bit) libwx_gtk2u_core-suse.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_html-suse.so.3.0.5()(64bit) libwx_gtk2u_html-suse.so.3.0.5(WXU_3.0)(64bit) libxcb.so.1()(64bit)"

inherit rpm
