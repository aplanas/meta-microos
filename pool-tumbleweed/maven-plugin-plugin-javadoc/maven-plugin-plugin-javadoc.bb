SUMMARY = "Javadoc for maven-plugin-plugin"
DESCRIPTION = "API documentation for maven-plugin-plugin."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-plugin-javadoc-3.6.0-5.1.noarch.rpm"
RPM_HASH = "3875ccef24dd2311355f224d79390bb68236c667a2fb06a87f4f54cc3bf6e7e262f48c2c8c8c24d7337868e2032259a2efae35b5154c7fc06a4b54700303f362"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-plugin-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
