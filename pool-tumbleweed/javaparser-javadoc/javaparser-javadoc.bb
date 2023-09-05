SUMMARY = "Javadoc for javaparser"
DESCRIPTION = "This package contains API documentation for javaparser."
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "3.25.5"

RPM_NAME = "javaparser-javadoc-3.25.5-1.1.noarch.rpm"
RPM_HASH = "23415b06d924782625367f8cf1a002891d7c42916a2f530d954357c06d02928c0bafe65f8fce0b472fbb52d9c3d686baf27fcbde243e415dd908441fabadd883"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javaparser-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
