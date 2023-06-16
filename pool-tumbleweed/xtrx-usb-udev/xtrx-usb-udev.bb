SUMMARY = "Udev rules for XTRX USB devices"
DESCRIPTION = "Udev rules for XTRX USB devices."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20201202"

RPM_NAME = "xtrx-usb-udev-0.0.0+git.20201202-2.6.noarch.rpm"
RPM_HASH = "b34f19a52e363397991ba97e513662089474cc552ab8ab833d5496f61f50e0ef5cc255d497236f9ef19fff65ec39fef658670d5c712d98d69bc5d93ffd2fc904"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xtrx-udev \
xtrx-usb-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
pwdutils"

inherit rpm
