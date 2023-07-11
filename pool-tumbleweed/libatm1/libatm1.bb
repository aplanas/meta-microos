SUMMARY = "Libraries for ATM"
DESCRIPTION = "Libraries for ATM (Asynchronous Transfer Mode) networking."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.5.2"

RPM_NAME = "libatm1-2.5.2-8.9.aarch64.rpm"
RPM_HASH = "5a0fb63de58b070ac00a2d6642274baff9308ca0d9687ee6f4695fcfa1faeaf97627fce5eff512b13a960fe30900dcd39bb9769a26c4a1433666d99fca9617ef"

RPROVIDES:${PN} += "libatm.so.1 \
libatm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
