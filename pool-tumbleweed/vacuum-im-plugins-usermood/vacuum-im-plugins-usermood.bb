SUMMARY = "Vacuum-IM user mood plugin"
DESCRIPTION = "Vacuum-IM plugin to send and receive information about user moods."
LICENSE = "GPL-3.0-only"

PV = "0.0.1"

RPM_NAME = "vacuum-im-plugins-usermood-0.0.1-9.23.aarch64.rpm"
RPM_HASH = "60effb559f559432d14c86c74b22be1b89841b19e88acf311bd3309c4fbb54d920c71e149112264160225c8277c4d426d974396bff864bda0fa89caa54f5e3ba"

RPROVIDES:${PN} += "libusermood.so \
vacuum-im-plugins-usermood"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvacuumutils.so.37"

inherit rpm
