SUMMARY = "The GNU Compiler Collection targeting epiphany"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting epiphany."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-epiphany-gcc13-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "6ce6f6a250dc156bf6e825aed9cf161596756cafaff18a8ce5fd13257c1c93a667a495e2d2d629fa6c1c3cb1980118a9135a0d49b530c92d7fd7364aa9cebb80"

RPROVIDES:${PN} += "cross-epiphany-gcc13 \
epiphany-elf-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-epiphany-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
