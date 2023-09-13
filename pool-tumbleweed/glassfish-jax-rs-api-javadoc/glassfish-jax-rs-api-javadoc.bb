SUMMARY = "Javadoc for glassfish-jax-rs-api"
DESCRIPTION = "This package contains API documentation for glassfish-jax-rs-api."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.1.6"

RPM_NAME = "glassfish-jax-rs-api-javadoc-2.1.6-2.1.noarch.rpm"
RPM_HASH = "3eb9ab68cf5dc3e44fcc2266e0179db74aad9656a54c1b341c2cc5674fb638fc3ee3ae8a6d888593bcc081aa66428d50b17ccd6bda2480d195d0e26f00ccfd52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jax-rs-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
