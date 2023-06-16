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

RPM_NAME = "backupninja-1.2.2-1.1.aarch64.rpm"
RPM_HASH = "a8a2e73259901068018ac5e5b575b2b45ad465ea49e56d797d5529f76a673a75e2bab9cb5547cd5245362e311570231994997a4e1541caab4e0ebc9a8fdb7f8e"

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
