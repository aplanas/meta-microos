SUMMARY = "VNC viewer in java"
DESCRIPTION = "A VNC client written in java that can be used as standalone application or as \
an applet inside web page."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.13.1"

RPM_NAME = "xorg-x11-Xvnc-java-1.13.1-3.1.noarch.rpm"
RPM_HASH = "da86c04b3b4e2da2cc8e4573b5bfd1304c7e772765ee57454a081db18d13e827ffe08a59e7fb39f436249899a6ed83a133c6bd79e0abc32f410d3bab4f6502d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xorg-x11-Xvnc-java"

RDEPENDS:${PN} += "systemd"

inherit rpm
