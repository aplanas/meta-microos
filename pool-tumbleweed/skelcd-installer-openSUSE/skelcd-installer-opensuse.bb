SUMMARY = "installer and related files needed on dvd1"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the first product dvds to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "skelcd-installer-openSUSE-17.91-1.90.aarch64.rpm"
RPM_HASH = "08e581da3df30b66b72bdbf833c443fc683ba00582ab619d2ec1e137c495f9cb6597277394bcea8214c6e1cd4dda98cb76aced4022a080df402f21e62c5fe11f"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
