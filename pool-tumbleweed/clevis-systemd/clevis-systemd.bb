SUMMARY = "Systemd integration for Clevis"
DESCRIPTION = "Automatically unlock LUKS devices in /etc/crypttab with Clevis."
LICENSE = "GPL-3.0-or-later"

PV = "19"

RPM_NAME = "clevis-systemd-19-2.1.aarch64.rpm"
RPM_HASH = "37db32ed6d80469cb1cfe82b57d5873ecfb5d98e49dd2ed7b5d250d0d0ee68159c5894ea0272d6eab184ebff4bcc22bdce240f03381059cf33f8ccea7be8cd3a"

RPROVIDES:${PN} += "clevis-systemd"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
clevis-luks \
systemd"

inherit rpm
