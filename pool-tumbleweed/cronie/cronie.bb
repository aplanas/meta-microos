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

RPM_NAME = "cronie-1.6.1-91.3.aarch64.rpm"
RPM_HASH = "63c9fcf60d435d7fb970db4fb7e68f1fde542359ab96871c02bb32272aed46e0c5f7db0e3d8690572f51a5c227935b4079610169b0821fc4882c93ef66dac925"

RPROVIDES:${PN} += "config(cronie) \
cronie \
cronie(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
cron \
debianutils \
fillup \
group(trusted) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaudit.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
mail \
permissions \
systemd"

inherit rpm
