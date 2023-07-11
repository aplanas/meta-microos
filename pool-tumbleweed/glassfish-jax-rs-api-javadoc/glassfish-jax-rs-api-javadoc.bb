SUMMARY = "Javadoc for glassfish-jax-rs-api"
DESCRIPTION = "This package contains API documentation for glassfish-jax-rs-api."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.1.6"

RPM_NAME = "glassfish-jax-rs-api-javadoc-2.1.6-1.4.noarch.rpm"
RPM_HASH = "c03d06a99efb428a9c44d2cd4a9c4acfcbc9c847ae28849c529f735879a61fbd4fd47662185ab8a30205c323fa9e2f3d45734f1b7bf574f02680ac3a43c90ea5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jax-rs-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
