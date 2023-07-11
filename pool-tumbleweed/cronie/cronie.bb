SUMMARY = "Cron Daemon"
DESCRIPTION = "cron automatically starts programs at specific times. Add new entries \
with 'crontab -e'. (See 'man 5 crontab' and 'man 1 crontab' for \
documentation.) \
 \
Under /etc, find the directories cron.hourly, cron.daily, cron.weekly, \
and cron.monthly.  Scripts and programs that are located there are \
started automatically."
LICENSE = "BSD-3-Clause & GPL-2.0-only & MIT"

PV = "1.6.1"

RPM_NAME = "cronie-1.6.1-91.4.aarch64.rpm"
RPM_HASH = "a5590e5a120b38cbdecf118caba035f25ed7b1488ec09115d942b35bdd0dc5a07327421be3b239c8659502a372fce3808241cddd475c47ad283124ef16aa35bf"

RPROVIDES:${PN} += "config-cronie \
cronie"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
cron \
debianutils \
fillup \
group-trusted \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libpam.so.0 \
libselinux.so.1 \
mail \
permissions \
systemd"

inherit rpm
