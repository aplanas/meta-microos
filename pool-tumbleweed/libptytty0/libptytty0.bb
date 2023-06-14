SUMMARY = "Library to handle pty/tty and utmp/wtmp/lastlog"
DESCRIPTION = "libptytty is an offspring of rxvt-unicode that handles \
pty/tty/utmp/wtmp/lastlog handling in mostly OS-independent ways."
LICENSE = "GPL-2.0-only"

PV = "2.0"

RPM_NAME = "libptytty0-2.0-2.7.aarch64.rpm"
RPM_HASH = "f3e0356f5dfdf3c69e0180dbcbe3427421138a665e298f5118e15396f1bd91fc25cc3f7f9e5c3714ffee14577fdebb32c07b672b0038f3e3fa713f3616c9878f"

RPROVIDES:${PN} += "libptytty.so.0 \
libptytty0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
