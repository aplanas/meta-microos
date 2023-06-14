SUMMARY = "IBM Sametime Community Client library"
DESCRIPTION = "A library to establish instant messaging connections to the IBM \
Sametime IM server."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "meanwhile-devel-1.1.1-1.16.aarch64.rpm"
RPM_HASH = "3a8a752f494dee8473b239f856deb6dd90d1afa9aadce39f78449601f5fa53ad1da038129070dc1de3af48d099b18b7557f9e74de2dbd4c2111634c6d0218d0b"

RPROVIDES:${PN} += "meanwhile-devel \
pkgconfig-meanwhile"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmeanwhile1 \
pkgconfig-glib-2.0"

inherit rpm
