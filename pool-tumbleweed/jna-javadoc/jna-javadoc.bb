SUMMARY = "Javadocs for jna"
DESCRIPTION = "This package contains the javadocs for jna."
LICENSE = "Apache-2.0 | LGPL-2.1-or-later"

PV = "5.5.0"

RPM_NAME = "jna-javadoc-5.5.0-3.7.noarch.rpm"
RPM_HASH = "035230bd9b286168b20ed79a8e82e5e1a4001934668bcec96464070c5002aaf5167e7b13d6f53785fcbfeca0d6760becc1a93dee4c99cb3cafe67b44f3b9fa4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jna-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
