SUMMARY = "installer and related files needed on dvd1"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the first product dvds to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.90"

RPM_NAME = "skelcd-installer-openSUSE-17.90-1.24.aarch64.rpm"
RPM_HASH = "8360194454c48cb2f031b66030c15f1b23b631f84e0175b7b689a177fc8f57aa155eddbee977aa8e0457d9ed70c5b4266819bd25ecd93087b53d2e59d798f66f"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
