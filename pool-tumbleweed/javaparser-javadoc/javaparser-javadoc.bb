SUMMARY = "Javadoc for javaparser"
DESCRIPTION = "This package contains API documentation for javaparser."
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "3.25.3"

RPM_NAME = "javaparser-javadoc-3.25.3-1.2.noarch.rpm"
RPM_HASH = "30e30754cc22fc4d78dfa9b72df5f6a846c59a9a364f174786b16b40309fe210b2985d2c8982b82104d033040f02545641cc0bde059291bb7a79ea08e143cf9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javaparser-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
