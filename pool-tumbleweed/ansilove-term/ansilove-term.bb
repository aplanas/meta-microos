SUMMARY = "CLI tool to render text-mode art files as PNG files"
DESCRIPTION = "Ansilove-Term is a command line tool to render text-mode art files as \
PNG files, as well as displaying in several different mediums."
LICENSE = "BSD-3-Clause"

PV = "0.0.0+git.20190908"

RPM_NAME = "ansilove-term-0.0.0+git.20190908-2.1.aarch64.rpm"
RPM_HASH = "702922e00037f30fe016d28a894d971918c8f831b7ef36dd4e59f1d999edcd03314bb99149cf3554afcc61327a65e1295a23d1141a612602d2b0efc6e1594877"

RPROVIDES:${PN} += "ansilove-term"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
