SUMMARY = "Monitor for SMART devices"
DESCRIPTION = "SMARTmontools controls and monitors storage devices using the \
Self-Monitoring, Analysis, and Reporting Technology System (S.M.A.R.T.) \
built into ATA, SATA and SCSI Hard Drives. This is used to check the \
hard drive reliability and to predict drive failures. The suite \
contains two utilities. The first, smartctl, is a command line utility \
designed to perform simple S.M.A.R.T. tasks. The second, smartd, is a \
daemon that periodically monitors the smart status and reports errors \
to syslog. The package is compatible with the ATA/ATAPI-3 to -7 \
specification. The package is intended to incorporate as much 'vendor \
specific' and 'reserved' information as possible about disk drives. The \
commands man smartctl and man smartd will provide more information."
LICENSE = "GPL-2.0-or-later"

PV = "7.3"

RPM_NAME = "smartmontools-7.3-3.4.aarch64.rpm"
RPM_HASH = "795cbacdd73763c0a0d6e1a1e067e18598cbbe27acf1d32d266152ea2659bb32355f586ca335a28af7262908186347161c7da5851fa00cac810603c193404f75"

RPROVIDES:${PN} += "config-smartmontools \
smartmontools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
coreutils \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libgcc-s.so.1 \
libselinux.so.1 \
libstdc++.so.6 \
libsystemd.so.0 \
systemd"

inherit rpm
