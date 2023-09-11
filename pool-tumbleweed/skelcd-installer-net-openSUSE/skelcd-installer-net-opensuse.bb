SUMMARY = "installer and related files needed on network medium"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the network install medium to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "skelcd-installer-net-openSUSE-17.91-1.90.aarch64.rpm"
RPM_HASH = "8810e176a06f947df026ed548944c4a04185053d05431c983c80a94d0267bb9ef2fb9da843cea3dae69be479df97d85dee3eef83511907e5f5d718f792868c25"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-net-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
