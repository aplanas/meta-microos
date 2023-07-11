SUMMARY = "Non-ABI stable experimental API for the Qt5 network library"
DESCRIPTION = "This package provides private headers of libQt5Network that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Network-private-headers-devel-5.15.10+kde129-1.1.noarch.rpm"
RPM_HASH = "2e1b58e2a1696a7ad949de124ac9d30e104d009bdac5f2f6a24262ffb1499122480aab2dc0d68d7272ef6339f25c068e90c35c74d16daa99bfb4e7addc603729"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Network-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Network-devel"

inherit rpm
