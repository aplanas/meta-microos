SUMMARY = "OpenSSH password tool"
DESCRIPTION = "Tool that will prompt user for password when using OpenSSH in LXQt"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-openssh-askpass-1.3.0-1.2.aarch64.rpm"
RPM_HASH = "9649e2649d69a6c5e48008848ad20d0a1198c7321bb0c6f7ef8ff90835f2f468d0317763fc42390e1d6eb431f1bc15fe2cd5e3b427d4ecd8d724f27f259e7ec2"

RPROVIDES:${PN} += "lxqt-openssh-askpass"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
liblxqt.so.1 \
libstdc++.so.6"

inherit rpm
