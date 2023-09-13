SUMMARY = "installer and related files needed on dvd1"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the first product dvds to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "skelcd-installer-openSUSE-17.91-1.100.aarch64.rpm"
RPM_HASH = "4fd5efc6ca36284514d7121a189ed9708ed7d2e31a2f932676542d534b4335b17e245cb789ef20321d29269c9bdd655455ea2865050b8f0e6e45229badca2549"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
