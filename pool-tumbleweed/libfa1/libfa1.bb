SUMMARY = "Finite automaton library for Augeas"
DESCRIPTION = "Component library for the Augeas configuration parser."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13.0"

RPM_NAME = "libfa1-1.13.0-2.2.aarch64.rpm"
RPM_HASH = "5d9fb2bb7e466ea882a3ab211322ad0dd6c6e11a0d050747637e5d088912852585e99a928b910ac19df901e69f07be74ef16a75ab6f0bfdfc72b5320421e2be4"

RPROVIDES:${PN} += "libfa.so.1 \
libfa1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
