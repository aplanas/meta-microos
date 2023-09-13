SUMMARY = "Javadocs for jfreechart"
DESCRIPTION = "This package contains the API documentation for jfreechart."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.19"

RPM_NAME = "jfreechart-javadoc-1.0.19-2.1.noarch.rpm"
RPM_HASH = "672c90e073f88675060e935877ee44bb516e665740d52cb3e06a36f5be57ad9ab2f9b5b5aa191688c276c9cdabf50df26730e5cdb933cf4505698c65d60eebe9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jfreechart-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem \
jfreechart \
jpackage-utils"

inherit rpm
