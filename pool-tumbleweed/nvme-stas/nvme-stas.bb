SUMMARY = "NVMe STorage Appliance Services"
DESCRIPTION = "nvme-stas is a Central Discovery Controller (CDC) client for Linux. It \
handles Asynchronous Event Notifications (AEN) handling, Automated, \
NVMe subsystem connection controls, Error handling and reporting and \
Automatic (zeroconf) and Manual configuration."
LICENSE = "Apache-2.0"

PV = "2.2.2"

RPM_NAME = "nvme-stas-2.2.2-1.2.aarch64.rpm"
RPM_HASH = "05d1905408204ce8cc16754adec19ac22192ae8677a507a7eebae145e300054bdac7e9c6489994673fa5be84743c5f7e7eb1019add4ea62453ebf817f09b2197"

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
