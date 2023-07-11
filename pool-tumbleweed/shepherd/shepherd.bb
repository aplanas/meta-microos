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

RPM_NAME = "shepherd-0.8.1-1.10.aarch64.rpm"
RPM_HASH = "f62cc9c9d949b2451b78a20d5f33cf1ad0c9e8cc5a29329be80caa200ff5d3149b743f45e470b2fd8cba783c062dba707f8a9e615da0fa9fc65ed2de93096160"

RPROVIDES:${PN} += "shepherd"

RDEPENDS:${PN} += "/usr/bin/guile \
/usr/bin/sh \
libc.so.6"

inherit rpm
