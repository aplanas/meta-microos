SUMMARY = "installer and related files needed on network medium"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the network install medium to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "skelcd-installer-net-openSUSE-17.89-1.57.aarch64.rpm"
RPM_HASH = "ee8f42f38f5cea91c1d7a2ceb21b0e4c9166bc1491b1a1566db5b01c767478fda8adecd943b921ce46038e378e1245ca94e9959de22aae858a203e8f556ec7b5"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-net-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
