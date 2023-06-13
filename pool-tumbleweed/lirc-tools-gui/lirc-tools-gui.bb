SUMMARY = "LIRC GUI tools"
DESCRIPTION = "Some seldom used X11-based tools for debugging lirc configurations."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "lirc-tools-gui-0.10.1-10.1.aarch64.rpm"
RPM_HASH = "1e4b939bf01ac7280ca27a879e2b441d4df2ff75989f2ac84adea3d300a2557edacaec2c2e6ca385668f1a0222a9fe4e2978a023856e2a321ff4179e279f0d27"

RPROVIDES:${PN} += "lirc-tools-gui \
lirc-tools-gui(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
liblirc.so.0()(64bit) \
liblirc_client.so.0()(64bit) \
lirc-core \
xorg-x11-fonts-core"

inherit rpm
