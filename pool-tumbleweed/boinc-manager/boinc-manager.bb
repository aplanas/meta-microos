SUMMARY = "GUI to control and monitor boinc-client"
DESCRIPTION = "The BOINC Manager is a graphical monitor and control utility for the BOINC \
core client. It gives a detailed overview of the state of the client it is \
monitoring. The BOINC Manager has two modes of operation, the 'Simple View' in \
which it only displays the most important information and the 'Advanced View' \
in which all information and all control elements are available."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "7.22.2"

RPM_NAME = "boinc-manager-7.22.2-1.1.aarch64.rpm"
RPM_HASH = "0797de569dbf52c92195381605bff8b7562267160e54cd4921a3bbdc24bccb76dc159db0f06d11d90530137a2826f2383ad442e519f072da4189da634634f1d9"

RPROVIDES:${PN} += "application() \
application(boinc.desktop) \
boinc-manager \
boinc-manager(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
hicolor-icon-theme \
ld-linux-aarch64.so.1()(64bit) \
libboinc.so.7()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libnotify.so.4()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.3.0.5()(64bit) \
libwx_baseu_net-suse.so.3.0.5()(64bit) \
libwx_gtk2u_adv-suse.so.3.0.5()(64bit) \
libwx_gtk2u_core-suse.so.3.0.5()(64bit) \
libwx_gtk2u_html-suse.so.3.0.5()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
