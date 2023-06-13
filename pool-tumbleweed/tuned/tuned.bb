SUMMARY = "A dynamic adaptive system tuning daemon"
DESCRIPTION = "The tuned package contains a daemon that tunes system settings dynamically. \
It does so by monitoring the usage of several system components periodically. \
Based on that information components will then be put into lower or higher \
power saving modes to adapt to the current usage. Currently only ethernet \
network and ATA harddisk devices are implemented."
LICENSE = "GPL-2.0-or-later"

PV = "2.20.0.18+git.7b1a20b"

RPM_NAME = "tuned-2.20.0.18+git.7b1a20b-1.1.noarch.rpm"
RPM_HASH = "252e71b0df1f74a505bfed34f227ef97a723b342b8dc5383980b6c58a28ff5dc587f2c1cd920941edd194c85036e50b989154993b1895d6623a11392a6a5f0f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(tuned) \
tuned"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3 \
cpupower \
ethtool \
gawk \
hdparm \
polkit \
python(abi) \
python3-configobj \
python3-dbus-python \
python3-decorator \
python3-gobject \
python3-linux-procfs \
python3-pyudev \
systemd \
util-linux \
virt-what"

inherit rpm
