SUMMARY = "installer and related files needed on dvd1"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the first product dvds to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "skelcd-installer-openSUSE-17.89-1.47.aarch64.rpm"
RPM_HASH = "65584bac5a3b1530815f8078a75624b3d8a355269423f8e01b646b9552e714cffc6418ab0527033b2765ab0a6c1473f3c6fafa061913df58140a28ac44e22e12"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
