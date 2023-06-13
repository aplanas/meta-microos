SUMMARY = "Host reset daemon and client using sanlock"
DESCRIPTION = "The reset daemon and client for sanlock. \
A cooperating host running the daemon can be reset by a host \
running the client, so long as both maintain access to a \
common sanlock lockspace."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.8.5"

RPM_NAME = "sanlk-reset-3.8.5-1.3.aarch64.rpm"
RPM_HASH = "300373bae0aa2aac027a9050d7d8048ff290245d8148d9311241dba264c6ba165a8460457d32430fd8227e3c7688e977463ce1e7800d99127e26591bd1956d95"

RPROVIDES:${PN} += "sanlk-reset \
sanlk-reset(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libsanlock.so.1()(64bit) \
libsanlock1 \
libwdmd.so.1()(64bit) \
sanlock"

inherit rpm
