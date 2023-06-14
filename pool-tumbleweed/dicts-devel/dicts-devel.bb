SUMMARY = "Source code of ispell dicts packages"
DESCRIPTION = "This package includes the source code of various ispell \
dicts packages for completeness."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & SUSE-Permissive & LGPL-2.1-only & MPL-1.1 & CC-BY-SA-1.0"

PV = "1.5"

RPM_NAME = "dicts-devel-1.5-422.6.noarch.rpm"
RPM_HASH = "84440d596630d455719df03bcd11c4283fe8e5cfe6f831d0641a8747c34ac22f5d07e7ab0f94f1cd2640a593b5a344a579ee755392a055d6045d29818cfdcc3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dicts-/usr/src/dicts/fix8bit.c \
dicts-devel"

RDEPENDS:${PN} += "/usr/bin/awk"

inherit rpm
