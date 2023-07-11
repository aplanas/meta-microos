SUMMARY = "Tools to manipulate firmware for Built-in iSight"
DESCRIPTION = "This project provide tools to manipulate firmware for Built-in iSight \
found on Apple machine since iMac G5 iSight"
LICENSE = "GPL-2.0"

PV = "1.6"

RPM_NAME = "isight-firmware-tools-1.6-17.30.aarch64.rpm"
RPM_HASH = "c11eb92e5b71752223b07dc5c12a994ce7efb9a413ea6db9e842d057ced452d74c359890746b787eab296fd4775d1d78bb5c638efcd934c66fb8248d8b3ef9a6"

RPROVIDES:${PN} += "isight-firmware-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libusb-0.1.so.4 \
systemd"

inherit rpm
