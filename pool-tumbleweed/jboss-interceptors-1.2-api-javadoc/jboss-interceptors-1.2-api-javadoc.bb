SUMMARY = "Javadoc for jboss-interceptors-1.2-api"
DESCRIPTION = "This package contains javadoc for jboss-interceptors-1.2-api."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.0.0"

RPM_NAME = "jboss-interceptors-1.2-api-javadoc-1.0.0-2.7.noarch.rpm"
RPM_HASH = "88f56051ee10598488ad7f003dc2ee7880b5b6121b2799485750beeecd8a8aa992e2ed277a4bb12f7cae002bf9c2e86a702999be3ab42ead7bb4bf878e54b6c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-interceptors-1.2-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
