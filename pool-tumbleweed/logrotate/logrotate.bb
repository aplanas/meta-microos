SUMMARY = "Cron service for rotating, compressing, mailing and removing system log files"
DESCRIPTION = "The logrotate utility does automatic rotation, compression, mailing and removal \
of log files. Logrotate can be set to handle a log file daily, weekly, monthly, \
or when the log file reaches a certain size. Normally, logrotate runs as a \
daily cron job. \
 \
It manages plain files only and is not involved in systemd's journal rotation."
LICENSE = "GPL-2.0-or-later"

PV = "3.21.0"

RPM_NAME = "logrotate-3.21.0-1.3.aarch64.rpm"
RPM_HASH = "5eddc3cc31264d92d533685ae62732f92cd73830ae4986fe62a8bcf12cb0776b4af39e2cbfbc4768163531775916d885559fb8ebd3348e8978d400c22e3acd78"

RPROVIDES:${PN} += "logrotate"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/xz \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libpopt.so.0 \
libselinux.so.1"

inherit rpm
