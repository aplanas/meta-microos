SUMMARY = "LIRC GUI tools"
DESCRIPTION = "Some seldom used X11-based tools for debugging lirc configurations."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "lirc-tools-gui-0.10.1-10.2.aarch64.rpm"
RPM_HASH = "b1ec7b35de23f01969afa764f4787ab446ab68f2f0e14cd0953615f4c14f6ee19cf536989ad2f25d3240273558c407057de3f75da07ace77dc3897ca607c1257"

RPROVIDES:${PN} += "lirc-tools-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
liblirc-client.so.0 \
liblirc.so.0 \
lirc-core \
xorg-x11-fonts-core"

inherit rpm
