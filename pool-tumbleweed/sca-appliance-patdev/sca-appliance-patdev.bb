SUMMARY = "Supportconfig Analysis Appliance Pattern Development"
DESCRIPTION = "The SCA Appliance allows for adding custom patterns. This package \
provides a database used to create pattern templates, speeding up \
custom pattern development. \
 \
See /usr/share/doc/packages/sca-appliance-common/COPYING.GPLv2"
LICENSE = "GPL-2.0-only"

PV = "1.3.1"

RPM_NAME = "sca-appliance-patdev-1.3.1-1.9.noarch.rpm"
RPM_HASH = "2b0cc20d6b5bd25414c4c2e47974f6494cf6b16a1a6091773ea44ab6e1326cde1aa271778461ad8b696aa4332bbfd34a4ae831e00c7aaa29326a662b5a02f5a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-sca-appliance-patdev \
sca-appliance-patdev"

RDEPENDS:${PN} += "/usr/bin/bash \
sca-appliance-common \
sca-patterns-base"

inherit rpm
