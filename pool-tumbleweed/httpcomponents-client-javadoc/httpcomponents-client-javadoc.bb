SUMMARY = "API documentation for httpcomponents-client"
DESCRIPTION = "API documentation for httpcomponents-client."
LICENSE = "Apache-2.0"

PV = "4.5.12"

RPM_NAME = "httpcomponents-client-javadoc-4.5.12-2.6.noarch.rpm"
RPM_HASH = "9e88fbac66d832914af374dcaa04b3297c66aee40ceb7986932e65e775fa9009a2e468d2f3a8396a3a72eedbc4ba88c0747ccccd7d3a755d562aa4dc5a1c3876"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpcomponents-client-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
