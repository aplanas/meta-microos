SUMMARY = "API documentation for glassfish-jsp-api"
DESCRIPTION = "API documentation for glassfish-jsp-api."
LICENSE = "Apache-2.0 & (CDDL-1.1 | GPL-2.0-only-WITH-Classpath-exception-2.0)"

PV = "2.3.3"

RPM_NAME = "glassfish-jsp-api-javadoc-2.3.3-4.3.noarch.rpm"
RPM_HASH = "75a35cc4ca97be20c5fcab852de7d0f220b12dc651a664159bc47d562d475f66d0116f9e0b1f14cb0a9c8880e02b99bba42ad93a754d14ee07b57c9750e9adc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jsp-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
