SUMMARY = "Dracut integration for Clevis"
DESCRIPTION = "Automatically unlock LUKS devices in /etc/crypttab with Clevis at early boot."
LICENSE = "GPL-3.0-or-later"

PV = "19"

RPM_NAME = "clevis-dracut-19-1.1.aarch64.rpm"
RPM_HASH = "5c0c4dfa4199f6f1b91adafef48e52ffa7b646e7ec09a765db395231b6922e009253117c85368cb53da3284a4f948b9ee0bb3f9c0004f7b2afda6128ebf99a39"

RPROVIDES:${PN} += "clevis-dracut clevis-dracut(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh clevis-systemd dracut"

inherit rpm
