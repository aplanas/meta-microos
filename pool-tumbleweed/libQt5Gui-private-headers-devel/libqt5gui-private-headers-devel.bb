SUMMARY = "Non-ABI stable experimental API for the Qt5 GUI library"
DESCRIPTION = "This package provides private headers of libQt5Gui that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Gui-private-headers-devel-5.15.10+kde129-2.1.noarch.rpm"
RPM_HASH = "af170e948e1f6063a497040be15c9531ae4730439b70c42ce9b82195da95cdc87fae23b3dcc4c4d6d7affe75973bfd95be16180a0c7f8b0956ba36b0151da51e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Gui-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Gui-devel"

inherit rpm
