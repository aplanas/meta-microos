SUMMARY = "Udev rules for XTRX USB devices"
DESCRIPTION = "Udev rules for XTRX USB devices."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20201202"

RPM_NAME = "xtrx-usb-udev-0.0.0+git.20201202-2.7.noarch.rpm"
RPM_HASH = "2e6242547bfc371aa48f475395736d68348dc4933886a9ca08abb811d4bd48cb47890289ec231f6c9dfdd1ba4e410542f28ed03a588114ae027a577d64e9b0ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xtrx-udev \
xtrx-usb-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
pwdutils"

inherit rpm
