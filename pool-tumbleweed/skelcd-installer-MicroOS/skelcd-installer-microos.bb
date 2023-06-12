SUMMARY = "installer and related files needed on dvd1"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the first product dvds to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.87"

RPM_NAME = "skelcd-installer-MicroOS-17.87-1.9.aarch64.rpm"
RPM_HASH = "a1d66313125c0dd37b3d7cae1a64a0479d3762367efed058714ddc1bf5759e6ec097ea76552554046beb5e6635a64e3d458c84972ae0427db21d52131239cafc"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-MicroOS \
skelcd-installer-MicroOS(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
