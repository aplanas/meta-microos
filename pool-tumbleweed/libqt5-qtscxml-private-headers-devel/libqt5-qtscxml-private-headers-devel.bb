SUMMARY = "Non-ABI stable experimental API for Qt5's State Chart XML library"
DESCRIPTION = "This package provides private headers of libqt5-qtscxml that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtscxml-private-headers-devel-5.15.10+kde0-1.1.noarch.rpm"
RPM_HASH = "c4c648f8b53c5845fe865758fd5cc29ac3141817e5af5eb42af89b01c94bccf60792947ab4f342259ba085cb362b47ce8b251de2e9fede8c3cd10cda505908c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtscxml-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libqt5-qtscxml-devel"

inherit rpm
