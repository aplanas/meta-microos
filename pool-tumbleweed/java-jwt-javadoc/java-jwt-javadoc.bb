SUMMARY = "Javadoc for java-jwt"
DESCRIPTION = "API documentation for the Logback library"
LICENSE = "MIT"

PV = "3.8.3"

RPM_NAME = "java-jwt-javadoc-3.8.3-1.18.noarch.rpm"
RPM_HASH = "490001d51496cea3cbff29de4b61e9d5185c48db460db58917b8aef0c3536f1fee2ae81cfcf59b476aa269e628316f80755dcce4a9923c76da6398e352d55b9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-jwt-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
