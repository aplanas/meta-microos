SUMMARY = "A parallel remote execution system"
DESCRIPTION = "Salt is a distributed remote execution system used to execute commands and \
query data. It was developed in order to bring the best solutions found in \
the world of remote execution together and make them better, faster and more \
malleable. Salt accomplishes this via its ability to handle larger loads of \
information, and not just dozens, but hundreds or even thousands of individual \
servers, handle them quickly and through a simple and manageable interface."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-3006.0-4.1.aarch64.rpm"
RPM_HASH = "558452d31652320c70d6650643fd584bb35039fb82ed1ea216e2cabbc469703f1ebd1aa497bb01fdf93d2e268622775fd2ad7bfdf2ef942e550e58f5f5ea1776"

RPROVIDES:${PN} += "config-salt \
salt"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/python3 \
/usr/bin/sh \
/usr/bin/touch \
/usr/sbin/groupadd \
/usr/sbin/useradd \
dbus-1 \
fillup \
iproute2 \
logrotate \
procps \
python3-salt \
shadow"

inherit rpm
