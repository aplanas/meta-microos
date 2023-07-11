SUMMARY = "Dracut integration for Clevis"
DESCRIPTION = "Automatically unlock LUKS devices in /etc/crypttab with Clevis at early boot."
LICENSE = "GPL-3.0-or-later"

PV = "19"

RPM_NAME = "clevis-dracut-19-2.2.aarch64.rpm"
RPM_HASH = "ffbd625804031fa44d943beb6f4c2bba1cb6666fa49d6855527f89083d09564bb89c6b865ef6f3702c59061626236febfa880e9446fd85ee75aec228f0d85d79"

RPROVIDES:${PN} += "clevis-dracut"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
clevis-systemd \
dracut"

inherit rpm
