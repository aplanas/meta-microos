SUMMARY = "Development files for libturris-spectator"
DESCRIPTION = "The libturris-spectator-devel package contains libraries and header files for \
developing applications that use libturris-spectator."
LICENSE = "GPL-3.0+"

PV = "0.6+git74.9ef0de5"

RPM_NAME = "libturris-spectator-devel-0.6+git74.9ef0de5-1.27.aarch64.rpm"
RPM_HASH = "4fb9894cb374b892ec4429da14384bddcc808eb1748d8dd17f96df9b58ef71a467980042c734a6ad40f57395df87cbc9f26e2a266cfc090418c268d86c86588d"

RPROVIDES:${PN} += "libturris-spectator-devel"

RDEPENDS:${PN} += "libturris-spectator0"

inherit rpm
