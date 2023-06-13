SUMMARY = "Supportconfig Analysis Patterns for SUSE Manager"
DESCRIPTION = "Supportconfig Analysis (SCA) appliance patterns to identify known \
issues relating to all versions of SUSE Manager (SUMA) \
 \
See /usr/share/doc/packages/sca-patterns-base/COPYING.GPLv2"
LICENSE = "GPL-2.0-only"

PV = "1.5.0"

RPM_NAME = "sca-patterns-suma-1.5.0-1.6.noarch.rpm"
RPM_HASH = "84c969936a725b2ff3966045be1a90dc3fc5de2422b00e5910ae83fa4dcbe143bed5a42c240bff3b10801a62e94f46d39d71290d2bb6fc2a389f7b148e745390"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sca-patterns-suma"

RDEPENDS:${PN} += "/usr/bin/python3 \
sca-patterns-base"

inherit rpm
