SUMMARY = "Javadoc for jffi"
DESCRIPTION = "This package contains the API documentation for jffi."
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "1.3.11"

RPM_NAME = "jffi-javadoc-1.3.11-1.2.noarch.rpm"
RPM_HASH = "1b0b6a261e7e3e28e09cb22895c457d7f9f6268a52377aa7a1db55a01800258cfc46e9f6ae3edd5adff44422338f2dd42827b9a9e5f55d0ce8c4abcc73203326"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jffi-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
