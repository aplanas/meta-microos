SUMMARY = "Javadoc for jboss-interceptors-1.2-api"
DESCRIPTION = "This package contains javadoc for jboss-interceptors-1.2-api."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.0.0"

RPM_NAME = "jboss-interceptors-1.2-api-javadoc-1.0.0-2.6.noarch.rpm"
RPM_HASH = "64bf73a973d582547ef7818ad4134127132aa9275065f0f9a015b4d9d10783aede0e0d5f2e7016f2ca19189e1c42f5e194e21c5a1f814a747c9108604c4a5cb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-interceptors-1.2-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
