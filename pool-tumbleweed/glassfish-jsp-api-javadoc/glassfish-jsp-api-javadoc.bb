SUMMARY = "API documentation for glassfish-jsp-api"
DESCRIPTION = "API documentation for glassfish-jsp-api."
LICENSE = "Apache-2.0 & (CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0)"

PV = "2.3.3"

RPM_NAME = "glassfish-jsp-api-javadoc-2.3.3-4.4.noarch.rpm"
RPM_HASH = "5762323d88d1c46477c7ee77327661181a55d3fe4f5164d3f5f940582ee6fb62b81379c5c63a5fd0f0a00a46625623f31a356b8fad9aaac8a55cee40eb390771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jsp-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
