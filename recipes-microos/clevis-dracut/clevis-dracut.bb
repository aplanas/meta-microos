SUMMARY = "Dracut integration for Clevis"
DESCRIPTION = "Automatically unlock LUKS devices in /etc/crypttab with Clevis at early boot."
LICENSE = "GPL-3.0-or-later"

PV = "19"

RPM_NAME = "clevis-dracut-19-2.1.aarch64.rpm"
RPM_HASH = "8bf9192286cce134e38ee6105bd0a52ad9aa7bc05a306fe610f75e6ad6da108b3b04f527bd728c8577804a6be57c9ccbf42e9b896b2cd63fa880ee7cc54e3b9b"

RPROVIDES:${PN} += "clevis-dracut clevis-dracut(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh clevis-systemd dracut"

inherit rpm
