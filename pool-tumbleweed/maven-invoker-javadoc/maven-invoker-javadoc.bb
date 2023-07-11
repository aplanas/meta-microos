SUMMARY = "Javadoc for maven-invoker"
DESCRIPTION = "API documentation for maven-invoker."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "maven-invoker-javadoc-3.1.0-2.4.noarch.rpm"
RPM_HASH = "b5cb538259c3249caac5e49a894debcffdb4442e438a7f2cf2e680e061af031ff5d43d988d8bc650602d1b0fc23f3dfa460f930df37431e2779ec7d12c7658ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-invoker-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
