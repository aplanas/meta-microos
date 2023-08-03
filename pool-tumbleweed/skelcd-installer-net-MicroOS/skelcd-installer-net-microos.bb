SUMMARY = "installer and related files needed on network medium"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the network install medium to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.90"

RPM_NAME = "skelcd-installer-net-MicroOS-17.90-1.26.aarch64.rpm"
RPM_HASH = "d378af4097e16324f1380bc57bfc80d052e67b0294e5c7e17c17f3ca70929db1dde9507f495550bb321c767ed698957c0ae142e40758393de7886eee60007892"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-net-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
