SUMMARY = "Lightweight, extensible meta-backup system"
DESCRIPTION = "Backupninja allows you to coordinate system backup by dropping a few simple \
configuration files into /etc/backup.d/. Most programs you might use for making \
backups don't have their own configuration file format. Backupninja provides a \
centralized way to configure and coordinate many different backup utilities. \
The key features of backupninja are: \
- easy to read ini style configuration files. \
- you can drop in scripts to handle new types of backups. \
- backup actions can be scheduled."
LICENSE = "GPL-2.0-only"

PV = "1.2.2"

RPM_NAME = "backupninja-1.2.2-2.1.aarch64.rpm"
RPM_HASH = "75a59021dbb87c4bdf509b2dee733ddee121b03a5a9f368d0a1cdb26f61c3e70e49607fb0e8a3f601604b3599d3a42af3131bf5522be5a0c5555e60924ed5133"

RPROVIDES:${PN} += "backupninja \
config-backupninja"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
bash \
dialog \
gawk \
gzip \
logrotate \
pkgconfig-systemd"

inherit rpm
