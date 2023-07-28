SUMMARY = "installer and related files needed on network medium"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the network install medium to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "skelcd-installer-net-MicroOS-17.89-1.56.aarch64.rpm"
RPM_HASH = "5fc545fb8d81c4b84fb2b1eed74d26ea6c7cb6f7c1a92b12f263211465d0c272ebec34bff3a23a0f27296db06fc416d83f3144ecbd953400bb85876dd9d2264d"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-net-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
