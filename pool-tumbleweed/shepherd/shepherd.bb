SUMMARY = "Init and service manager"
DESCRIPTION = "The GNU Daemon Shepherd or GNU Shepherd, formerly known as GNU dmd, is \
a service manager that looks after the herd of system services. It \
provides a replacement for the service-managing capabilities of \
SysV-init (or any other init). It is intended \
for use on GNU/Hurd, but it is supposed to work on every POSIX-like \
system where Guile is available. In particular, it is used as PID 1 by \
GNU Guix."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.1"

RPM_NAME = "shepherd-0.8.1-1.9.aarch64.rpm"
RPM_HASH = "1ea0d385f6cc7c00d0e065effc4b9341cb0a668629a17ce932fd9ba6027e7c2a0516a133516574a00a1498c06074d051b316359f0e4ff813e6f95fb1c9ededae"

RPROVIDES:${PN} += "shepherd"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/guile \
libc.so.6"

inherit rpm
