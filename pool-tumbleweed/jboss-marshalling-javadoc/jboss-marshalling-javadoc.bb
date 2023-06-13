SUMMARY = "API documentation for jboss-marshalling"
DESCRIPTION = "This package contains API documentation for jboss-marshalling."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later"

PV = "1.4.11"

RPM_NAME = "jboss-marshalling-javadoc-1.4.11-1.20.noarch.rpm"
RPM_HASH = "cc85e41c94eca64f762c212cd2a91cd83ddefde24cf57af526a510884842b1a47486190e262be28bbcaa1ca11e3cd9c3bce256fe95b53ca91630be18625571a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-marshalling-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
