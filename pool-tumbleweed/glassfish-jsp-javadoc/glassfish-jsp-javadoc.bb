SUMMARY = "API documentation for glassfish-jsp"
DESCRIPTION = "API documentation for glassfish-jsp."
LICENSE = "Apache-2.0 & (CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0)"

PV = "2.3.4"

RPM_NAME = "glassfish-jsp-javadoc-2.3.4-2.10.noarch.rpm"
RPM_HASH = "5fb9a141eafb8a9f35787b8a8671c5aaffef6914d48c6fe82e8a3775fe0d92591220a027b3b75f85126bb08100d6de4cf81d598b265e7c1876489257e4632001"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jsp-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
