SUMMARY = "Supportconfig Analysis Patterns for SLE12"
DESCRIPTION = "Supportconfig Analysis (SCA) appliance patterns to identify known \
issues relating to all versions of SLE12 \
 \
See /usr/share/doc/packages/sca-patterns-base/COPYING.GPLv2"
LICENSE = "GPL-2.0-only"

PV = "1.5.5"

RPM_NAME = "sca-patterns-sle12-1.5.5-1.1.noarch.rpm"
RPM_HASH = "ba85cda1c545de496668b50295ee00233dc84e5ef08e3cf1667af6ebc6486a32ae0061cbf1c3f209f8ddf4c743348a5fc36e9a3f4b5726fd71ca61c4f25cdc4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sca-patterns-sle12"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
sca-patterns-base"

inherit rpm
