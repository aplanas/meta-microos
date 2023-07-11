SUMMARY = "Non-ABI stable experimental API for the Qt5 SQL library"
DESCRIPTION = "This package provides private headers of libQt5Sql that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Sql-private-headers-devel-5.15.10+kde129-1.1.noarch.rpm"
RPM_HASH = "0197f87fdf7ee7a66f260c5fed9d1eb62d2e15520c2840d4e9fd4e2b7ff36b8e77d3433edaab7164c9cdcd5884095f7d5931f2c7cb21797b0c8c1d40051dce14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Sql-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Sql-devel"

inherit rpm
