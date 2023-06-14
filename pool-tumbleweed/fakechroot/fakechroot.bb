SUMMARY = "Preloadable library for a fake chroot environment"
DESCRIPTION = "fakechroot runs a command in an environment where it is possible to use the \
chroot(8) command without root privileges. This is useful for allowing users to \
create own chrooted environments with the possibility to install other packages \
without the need for root privileges. \
 \
fakechroot does this by replacing some libc library functions (chroot(2), \
open(2), etc.) by ones that simulate the effect of being called with root \
privileges. \
 \
These wrapper functions are in a shared library called libfakechroot.so, which \
can be loaded through the LD_PRELOAD mechanism of the dynamic loader."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.20.1"

RPM_NAME = "fakechroot-2.20.1-2.8.aarch64.rpm"
RPM_HASH = "922eda2b99c690e278af99782fe48a0b4f708eb85896534714cd3acf067fe41ab0b8e53bc6562af92119205dca0977ddb3ae5c1946f03c1ee8232df975ed9000"

RPROVIDES:${PN} += "config-fakechroot \
fakechroot \
libfakechroot.so"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
