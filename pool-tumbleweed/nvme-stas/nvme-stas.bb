SUMMARY = "NVMe STorage Appliance Services"
DESCRIPTION = "nvme-stas is a Central Discovery Controller (CDC) client for Linux. It \
handles Asynchronous Event Notifications (AEN) handling, Automated, \
NVMe subsystem connection controls, Error handling and reporting and \
Automatic (zeroconf) and Manual configuration."
LICENSE = "Apache-2.0"

PV = "2.2"

RPM_NAME = "nvme-stas-2.2-1.1.aarch64.rpm"
RPM_HASH = "36352d248c511edeccfb1d306c84f120f5922c36c9a430495b5346c420200b66df666236517f13625b00bf7ade27fdc349e251917cb7a4a907c280f9aa507d82"

RPROVIDES:${PN} += "config-nvme-stas \
nvme-stas"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
avahi \
python-abi \
python3-dasbus \
python3-gobject \
python3-libnvme \
python3-pyudev \
python3-systemd \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
