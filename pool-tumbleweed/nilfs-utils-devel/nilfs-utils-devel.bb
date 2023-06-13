SUMMARY = "Development package for the libnilfs library"
DESCRIPTION = "This package contains the development files for NILFS v2."
LICENSE = "GPL-2.0-only"

PV = "2.2.9"

RPM_NAME = "nilfs-utils-devel-2.2.9-1.4.aarch64.rpm"
RPM_HASH = "978d73307d6986b81b4dede692a4cee14499360f12986cdd1534bfc25a0f00ba51cea2e9794973150f8e008d588ba48ef55dc37d64df633f2ac0b09d4fb292c6"

RPROVIDES:${PN} += "nilfs-utils-devel \
nilfs-utils-devel(aarch-64)"

RDEPENDS:${PN} += "libnilfs0"

inherit rpm
