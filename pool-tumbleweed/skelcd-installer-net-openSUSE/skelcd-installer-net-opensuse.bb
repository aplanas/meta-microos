SUMMARY = "installer and related files needed on network medium"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the network install medium to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "skelcd-installer-net-openSUSE-17.91-1.100.aarch64.rpm"
RPM_HASH = "06b3c0b76878934a4e05285e7a371f65fdd0af3488b728dcaf79287eb7b8200f98eb82e7ee2b0d3f06d61ae3f1f935fcc54722a018854bab53f2429875dcb198"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-net-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
