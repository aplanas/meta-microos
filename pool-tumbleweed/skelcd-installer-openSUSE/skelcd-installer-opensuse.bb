SUMMARY = "installer and related files needed on dvd1"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the first product dvds to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "skelcd-installer-openSUSE-17.89-1.40.aarch64.rpm"
RPM_HASH = "588364fee0b9a4d56a8d21d0a750951ab0fbcdf74ec894fdce067e41b9fd0ab7a98b9d9fc31711bcd3266457e353353ca79265b9f4ede3219bf7c98d5b204803"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
