SUMMARY = "Systemd integration for Clevis"
DESCRIPTION = "Automatically unlock LUKS devices in /etc/crypttab with Clevis."
LICENSE = "GPL-3.0-or-later"

PV = "19"

RPM_NAME = "clevis-systemd-19-2.2.aarch64.rpm"
RPM_HASH = "a6dc3282feb28c9c8fd2ab8afb9f2b76cd7d670a40ad7d6aa8799324b53312446381909b239ff5ecfdef60e8b815c4ee8f490d377ccbe9a40f8fb2d62233dab3"

RPROVIDES:${PN} += "clevis-systemd"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
clevis-luks \
systemd"

inherit rpm
