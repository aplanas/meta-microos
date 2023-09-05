SUMMARY = "installer and related files needed on network medium"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the network install medium to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "skelcd-installer-net-openSUSE-17.91-1.84.aarch64.rpm"
RPM_HASH = "bbc53cbc418598910fe639ed9e3605b32633da2e6c78941a333f2946da926e758037650b36bd510abb8d00f6917b9b0dd549a0c89cefdf7e803210d360a13c36"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-net-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
