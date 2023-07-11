SUMMARY = "A dynamic adaptive system tuning daemon"
DESCRIPTION = "The tuned package contains a daemon that tunes system settings dynamically. \
It does so by monitoring the usage of several system components periodically. \
Based on that information components will then be put into lower or higher \
power saving modes to adapt to the current usage. Currently only ethernet \
network and ATA harddisk devices are implemented."
LICENSE = "GPL-2.0-or-later"

PV = "2.20.0.18+git.7b1a20b"

RPM_NAME = "tuned-2.20.0.18+git.7b1a20b-1.2.noarch.rpm"
RPM_HASH = "f06be68b48aea0f295f016a06aa183f263b0390f2bd9e892430179afaab21c82c4fd11b63475d33a3a1df851738848e2c22500e27611dc2d696270fff0a709fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tuned \
tuned"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
cpupower \
ethtool \
gawk \
hdparm \
polkit \
python-abi \
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
