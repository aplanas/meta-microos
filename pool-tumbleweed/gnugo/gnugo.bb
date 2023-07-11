SUMMARY = "Chinese Board Game 'Go'"
DESCRIPTION = "Chinese ancient board game."
LICENSE = "GPL-3.0-or-later"

PV = "1371149103.84a32e9c"

RPM_NAME = "gnugo-1371149103.84a32e9c-1.20.aarch64.rpm"
RPM_HASH = "1f553f65cee14fd04d120e5f342d8aa2490d7f6634afa5a8dcaa9257f90e732279a467dfb03c4ff42fe53b4bfa703de7562944caa3c39526c2302d538dc17442"

RPROVIDES:${PN} += "gnugo"

RDEPENDS:${PN} += "/usr/bin/sh \
info \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libtinfo.so.6"

inherit rpm
