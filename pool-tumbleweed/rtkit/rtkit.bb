SUMMARY = "Realtime Policy and Watchdog Daemon"
DESCRIPTION = "RealtimeKit is a D-Bus system service that changes the scheduling policy of \
user processes/threads to SCHED_RR (i.e. realtime scheduling mode) on \
request. It is intended to be used as a secure mechanism to allow real-time \
scheduling to be used by normal user processes."
LICENSE = "BSD-3-Clause & GPL-3.0-or-later"

PV = "0.13"

RPM_NAME = "rtkit-0.13-5.1.aarch64.rpm"
RPM_HASH = "b5dbbd02826511d2ce751c9d9c8e9b16a0cc1d7e42aa70970f51e30e0e00d53999ff78a7082df86dba674c1ac6702aa2badc1e0b6cf8018fe0ccdb3bcea456d7"

RPROVIDES:${PN} += "group-rtkit \
rtkit \
user-rtkit"

RDEPENDS:${PN} += "/usr/bin/sh \
dbus-1 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libdbus-1.so.3 \
libsystemd.so.0 \
polkit \
sysuser-shadow"

inherit rpm
