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

RPM_NAME = "smartmontools-7.3-3.3.aarch64.rpm"
RPM_HASH = "d4a1e63e192c1bd2a1c7fcc539396775ac9eaeb2c584c7e46cc393e1b8be0e5f9487028389237fca341f24f42944c47f26524ccbc6779437f72659099029fdb9"

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
