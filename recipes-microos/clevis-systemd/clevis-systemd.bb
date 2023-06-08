SUMMARY = "Systemd integration for Clevis"
DESCRIPTION = "Automatically unlock LUKS devices in /etc/crypttab with Clevis."
LICENSE = "GPL-3.0-or-later"

PV = "19"

RPM_NAME = "clevis-systemd-19-1.1.aarch64.rpm"
RPM_HASH = "86de631a5e69bc54ab7eb79a6c5b9e10e7b74c9900f0edd357bd60b9beae74554b0bd18664b0b1809d199e710a7654c3eebcd1d8a8ab5f8ae1419adb236711ed"

RPROVIDES:${PN} += "clevis-systemd clevis-systemd(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh clevis-luks ncat systemd"

inherit rpm
