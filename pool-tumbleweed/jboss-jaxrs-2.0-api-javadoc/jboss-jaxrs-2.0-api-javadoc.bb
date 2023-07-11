SUMMARY = "Javadoc for jboss-jaxrs-2.0-api"
DESCRIPTION = "This package contains the API documentation for jboss-jaxrs-2.0-api."
LICENSE = "Apache-2.0 & (CDDL-1.0 | GPL-2.0-only)"

PV = "1.0.1"

RPM_NAME = "jboss-jaxrs-2.0-api-javadoc-1.0.1-3.9.noarch.rpm"
RPM_HASH = "2268042106d03fea96aaa8938b25538954c4b3a4becd9f913335468805374018e388b0f452139c24d1e868d78ab84fdd66c48d07def4fcd8ba8ea1478e1d8461"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-jaxrs-2.0-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
