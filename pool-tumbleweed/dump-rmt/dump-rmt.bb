SUMMARY = "Provides certain programs with access to remote tape devices"
DESCRIPTION = "The rmt utility provides remote access to tape devices for programs \
like dump (a filesystem backup program), restore (a program for \
restoring files from a backup), tar (an archiving program) and cpio."
LICENSE = "BSD-3-Clause"

PV = "0.4b47"

RPM_NAME = "dump-rmt-0.4b47-1.9.aarch64.rpm"
RPM_HASH = "31c1d7266dad3f19bd977be63d9d648f43e74a338f0789d7348163e7ff96f10691419362d56287b5a9f8f1a1560c753447fff50a48cc88d2252bd3c98b705a62"

RPROVIDES:${PN} += "dump-rmt \
dump-rmt(aarch-64) \
rmt"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
update-alternatives"

inherit rpm
