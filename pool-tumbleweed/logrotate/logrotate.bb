SUMMARY = "Cron service for rotating, compressing, mailing and removing system log files"
DESCRIPTION = "The logrotate utility does automatic rotation, compression, mailing and removal \
of log files. Logrotate can be set to handle a log file daily, weekly, monthly, \
or when the log file reaches a certain size. Normally, logrotate runs as a \
daily cron job. \
 \
It manages plain files only and is not involved in systemd's journal rotation."
LICENSE = "GPL-2.0-or-later"

PV = "3.21.0"

RPM_NAME = "logrotate-3.21.0-1.2.aarch64.rpm"
RPM_HASH = "48e116683948c956821d337f22c9c604a9b2e458c8f5419729047780800da89b1c0826e1575e199694fa153aaf99bea4d82ca0ef837b1745ba1dfe5546d58762"

RPROVIDES:${PN} += "logrotate \
logrotate(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/xz \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libacl.so.1()(64bit) \
libacl.so.1(ACL_1.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit)"

inherit rpm