SUMMARY = "Non-ABI stable experimental API for the Qt5 network library"
DESCRIPTION = "This package provides private headers of libQt5Network that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Network-private-headers-devel-5.15.10+kde129-2.1.noarch.rpm"
RPM_HASH = "428abef4ea803b63115956bd0644f531e246d6f8e55f01e4ce52c9339ba789c46ff654cd0e9412c1d8f08fae65ea805f71f32493ee0b5362b5115523fa8e7b58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Network-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Network-devel"

inherit rpm
