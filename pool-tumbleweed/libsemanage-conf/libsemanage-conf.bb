SUMMARY = "Configuration for the SELinux policy management library"
DESCRIPTION = "Configuration file for libsemanage. Moved to a separate package to allow \
parallel installation"
LICENSE = "LGPL-2.1-or-later"

PV = "3.5"

RPM_NAME = "libsemanage-conf-3.5-1.4.aarch64.rpm"
RPM_HASH = "4a3f323bb71e5f037ea7cdd7e1e2ef998ad26bf4a41dacd7257181a4c231c4190fc66d7a631dacac1fe50ae85867ad0e225589a86ccba23e469cacc742fe63f7"

RPROVIDES:${PN} += "config-libsemanage-conf \
libsemanage-conf"

RDEPENDS:${PN} += ""

inherit rpm
