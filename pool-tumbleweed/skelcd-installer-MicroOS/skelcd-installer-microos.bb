SUMMARY = "installer and related files needed on dvd1"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the first product dvds to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "skelcd-installer-MicroOS-17.89-1.31.aarch64.rpm"
RPM_HASH = "bc2331f2af8e36fa6fe5114198b98be24980c7308f68817435c05b7839197ce1c9b892541db43590f58e461bff21f417dda5c460affca68d900f4067d7ca3c74"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
