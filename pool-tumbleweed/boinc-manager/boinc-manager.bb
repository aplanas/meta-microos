SUMMARY = "GUI to control and monitor boinc-client"
DESCRIPTION = "The BOINC Manager is a graphical monitor and control utility for the BOINC \
core client. It gives a detailed overview of the state of the client it is \
monitoring. The BOINC Manager has two modes of operation, the 'Simple View' in \
which it only displays the most important information and the 'Advanced View' \
in which all information and all control elements are available."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "7.24.1"

RPM_NAME = "boinc-manager-7.24.1-1.1.aarch64.rpm"
RPM_HASH = "ae485cc7c175ffd34b0fc73d09e8459c2ca556336199f330a06b1f8376355b8884a4dc2e7fc9ece91c3d53a7bc207c9e423f3e76ce2fa2f3e891c2e4f9e6efd1"

RPROVIDES:${PN} += "boinc-manager"

RDEPENDS:${PN} += "/usr/bin/sh \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libboinc.so.7 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libnotify.so.4 \
libstdc++.so.6 \
libwx-baseu-net-suse.so.9.0.0 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0 \
libwx-gtk2u-html-suse.so.9.0.0 \
libxcb.so.1"

inherit rpm
