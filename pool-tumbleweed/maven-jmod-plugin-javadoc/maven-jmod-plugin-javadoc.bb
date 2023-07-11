SUMMARY = "Javadoc for maven-jmod-plugin"
DESCRIPTION = "API documentation for maven-jmod-plugin."
LICENSE = "Apache-2.0"

PV = "3.0.0~alpha1"

RPM_NAME = "maven-jmod-plugin-javadoc-3.0.0~alpha1-2.22.noarch.rpm"
RPM_HASH = "82144685f18e045924449f3a487987f6a9cd1c7eb792b835af435759552263fb5f1c301cbe8c733f739622357d091f9c4b815e27168bbc9efb14b5986c5660f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-jmod-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
