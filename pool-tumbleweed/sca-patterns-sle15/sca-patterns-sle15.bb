SUMMARY = "Supportconfig Analysis Patterns for SLE15"
DESCRIPTION = "Supportconfig Analysis (SCA) appliance patterns to identify known \
issues relating to all versions of SLE15. \
 \
See /usr/share/doc/packages/sca-patterns-base/COPYING.GPLv2"
LICENSE = "GPL-2.0-only"

PV = "1.5.3"

RPM_NAME = "sca-patterns-sle15-1.5.3-1.2.noarch.rpm"
RPM_HASH = "5cdb76eb7aa4b639ab7cd6e3d019664c032847d19678b1db331de1881369a1e8e4c1882a91409715f6003d92c43bf0c0797091001c698a00a7cfbef75a44eb70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sca-patterns-sle15"
RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
sca-patterns-base"

inherit rpm
