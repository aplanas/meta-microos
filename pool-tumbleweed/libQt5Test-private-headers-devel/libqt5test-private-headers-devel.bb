SUMMARY = "Non-ABI stable experimental API for the Qt5 test library"
DESCRIPTION = "This package provides private headers of libQt5Test that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Test-private-headers-devel-5.15.10+kde129-2.1.noarch.rpm"
RPM_HASH = "4920c0f8e211d25665baf1a14afc1c30dadd2ce589370a879ba2975ef990f2c9bb15f98d00750d6b48d9193adf507667b66e489a6a4391a38272098a5763b60c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Test-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Test-devel"

inherit rpm
