SUMMARY = "Javadoc for jboss-jaxrs-2.0-api"
DESCRIPTION = "This package contains the API documentation for jboss-jaxrs-2.0-api."
LICENSE = "Apache-2.0 & (CDDL-1.0 | GPL-2.0-only)"

PV = "1.0.1"

RPM_NAME = "jboss-jaxrs-2.0-api-javadoc-1.0.1-3.8.noarch.rpm"
RPM_HASH = "549f0c7f8602e8de21391172edf35f55a3dd9347279c0f3cad511df27146d79646b17dc586334b6631faec4e90ae9629562b91a24e87c4f8ada99eeaa8b64e03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-jaxrs-2.0-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
