SUMMARY = "installer and related files needed on network medium"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the network install medium to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.90"

RPM_NAME = "skelcd-installer-net-openSUSE-17.90-1.24.aarch64.rpm"
RPM_HASH = "76442595dc83201c59eecc9cd38de68aa6cadff2c6380b042db7f5e478fdbe1cb327782d955d3d720a8326607f6ca0030fa38a0d53390a78d09da365f8cf9cd1"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-net-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
