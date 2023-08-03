SUMMARY = "installer and related files needed on dvd1"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the first product dvds to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.90"

RPM_NAME = "skelcd-installer-MicroOS-17.90-1.26.aarch64.rpm"
RPM_HASH = "7467334f64fc269c26d375dd053025de009a65238c411e9c08da72e711f9cbb9ed236e75fe0deb6528827d002f8b6571ddbfbb7fb35e9c3ca04435dad93c7356"

RPROVIDES:${PN} += "skelcd-installer \
skelcd-installer-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
