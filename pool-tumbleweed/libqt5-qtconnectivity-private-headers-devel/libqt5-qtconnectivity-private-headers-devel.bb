SUMMARY = "Non-ABI stable experimental API"
DESCRIPTION = "This package provides private headers of libqt5-qtsensors that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde4"

RPM_NAME = "libqt5-qtconnectivity-private-headers-devel-5.15.10+kde4-1.1.noarch.rpm"
RPM_HASH = "8e5b63a2410793b19e8b6157594c648e7e6032e9199d1d318329d094168257a1e7f5430a29b256d594694abed608d54d75baf4fec5231003c5a094f6d31483ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtconnectivity-private-headers-devel"

RDEPENDS:${PN} += "libqt5-qtbase-private-headers-devel \
libqt5-qtconnectivity-devel \
libqt5-qtdeclarative-private-headers-devel"

inherit rpm
