SUMMARY = "Non-ABI stable experimental API for the Qt5 SQL library"
DESCRIPTION = "This package provides private headers of libQt5Sql that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Sql-private-headers-devel-5.15.10+kde129-2.1.noarch.rpm"
RPM_HASH = "2f813b93688b1085740eb0f63e28f331558872ccbdf18bb6e5f35e703347027e9b6eeb57bf604c3cad81f9089624c844d2334f1051f3febbe64d539ed01b2536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Sql-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Sql-devel"

inherit rpm
