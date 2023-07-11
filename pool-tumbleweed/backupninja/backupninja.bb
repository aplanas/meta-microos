SUMMARY = "Lightweight, extensible meta-backup system"
DESCRIPTION = "Backupninja allows you to coordinate system backup by dropping a few simple \
configuration files into /etc/backup.d/. Most programs you might use for making \
backups don't have their own configuration file format. Backupninja provides a \
centralized way to configure and coordinate many different backup utilities. \
The key features of backupninja are: \
- easy to read ini style configuration files. \
- you can drop in scripts to handle new types of backups. \
- backup actions can be scheduled."
LICENSE = "GPL-2.0"

PV = "1.2.2"

RPM_NAME = "backupninja-1.2.2-1.2.aarch64.rpm"
RPM_HASH = "34c78e00b8679a25957f99dd8a5844c769fe7b20684a0ee9aa5d6aefa5c9cb842edd40df8d11f79843ca82f292f8db110bb6c00d96d1f8b1ae038f38ade06e19"

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
