SUMMARY = "A backup and sync tool"
DESCRIPTION = "luckyBackup is an application that backs-up and/or synchronizes any directories \
with rsync. \
 \
It checks all declared directories before proceeding with any data \
manipulation, and, by way of rsync, transfers only changes and not \
all data."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "luckybackup-0.5.0-1.25.aarch64.rpm"
RPM_HASH = "645756ced12640a6918a963d55e5ba89a3b7f5cab9aeda29f3ec163acf94940304083021e71e2d2b8f4c98e253b091f08507b2102cdaea0b24f9d9a4c12eef84"

RPROVIDES:${PN} += "luckybackup"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
polkit \
rsync"

inherit rpm
