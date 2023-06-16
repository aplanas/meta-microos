SUMMARY = "Script to restore Xfce Panel Defaults"
DESCRIPTION = "This package provides a script /usr/bin/xfce4-panel-restore-defaults which calls allows to restore the Xfce Panel factory defaults. \
A desktop file and application launcher is provided."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.18.4"

RPM_NAME = "xfce4-panel-restore-defaults-4.18.4-1.1.aarch64.rpm"
RPM_HASH = "7cb3a2afcae90c144e62fcb28f54d43b83f5d8f0063c8c852df8265fb2d92d5fe861f282c636111d81a80a1af436775f1e13657b7434e80280155ba76b7aa1ef"

RPROVIDES:${PN} += "xfce4-panel-restore-defaults"

RDEPENDS:${PN} += "/usr/bin/bash \
zenity"

inherit rpm
