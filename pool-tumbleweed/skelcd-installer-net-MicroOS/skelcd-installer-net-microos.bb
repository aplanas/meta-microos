SUMMARY = "installer and related files needed on network medium"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the network install medium to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "skelcd-installer-net-MicroOS-17.91-1.66.aarch64.rpm"
RPM_HASH = "45f1634e0a97cb3a7f945a99ab1a269504a0e46f9e9cefdc0baeaa7dffa519c219be1da502e313e58c47a742a01fa16191713ef8cb54b523d011ce6226dfc668"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-net-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
