SUMMARY = "Non-ABI stable experimental API for the Qt5 XML Patterns library"
DESCRIPTION = "This package provides private headers of libqt5-qtxmlpatterns that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtxmlpatterns-private-headers-devel-5.15.10+kde0-1.1.noarch.rpm"
RPM_HASH = "65dad7e6acc7cc4a8218f81da0c93afa01e17e709cbe7ae7d38a08ddb40989c26f281df3677b7104c618854db073010ffaea97854d7567837ea2452c28b11a77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5XmlPatterns-private-headers-devel \
libqt5-qtxmlpatterns-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libqt5-qtxmlpatterns-devel"

inherit rpm
