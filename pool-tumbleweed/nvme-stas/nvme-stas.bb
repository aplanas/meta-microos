SUMMARY = "NVMe STorage Appliance Services"
DESCRIPTION = "nvme-stas is a Central Discovery Controller (CDC) client for Linux. It \
handles Asynchronous Event Notifications (AEN) handling, Automated, \
NVMe subsystem connection controls, Error handling and reporting and \
Automatic (zeroconf) and Manual configuration."
LICENSE = "Apache-2.0"

PV = "2.3~4"

RPM_NAME = "nvme-stas-2.3~4-1.1.aarch64.rpm"
RPM_HASH = "8db9e798042b5f015cc84ee0b94de18bd091844f27534412754bcea96da357bc06a1cbf09b3f6d8965e1dfc2c6efb745b9a554c08553381b77fdd714960735af"

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
