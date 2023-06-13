SUMMARY = "Javadoc for glassfish-jax-rs-api"
DESCRIPTION = "This package contains API documentation for glassfish-jax-rs-api."
LICENSE = "EPL-2.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.1.6"

RPM_NAME = "glassfish-jax-rs-api-javadoc-2.1.6-1.3.noarch.rpm"
RPM_HASH = "336d4d8f44a353f20c2a5139b264de3a0319b58ae944f76084aa5ce29b258a197bb5363311e39eaffa60e3a3cd863d4316af8fa3164116bf8daef7bdf133830a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jax-rs-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
