SUMMARY = "Non-ABI stable experimental API for the Qt5 network library"
DESCRIPTION = "This package provides private headers of libQt5Network that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Network-private-headers-devel-5.15.9+kde154-1.2.noarch.rpm"
RPM_HASH = "a10e8cfab5c4729315c2c2b64342a9cee62fa2673c3e29dcadf9d17e4e3556cf68fd46c7ce06a4ec4f3dd04cd25a8c9463960bd75fdb5f04bc211fcef06e10a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Network-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Network-devel"

inherit rpm
