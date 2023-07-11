SUMMARY = "API documentation for glassfish-jsp"
DESCRIPTION = "API documentation for glassfish-jsp."
LICENSE = "Apache-2.0 & (CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0)"

PV = "2.3.4"

RPM_NAME = "glassfish-jsp-javadoc-2.3.4-2.11.noarch.rpm"
RPM_HASH = "62faa669fccff5e08df81423eece22a73f377230d9c5e66b6c790a06b05c2908e0641ee607a0d701f87b59a60d1205aa4b2431d3d110c32b76e6dfcd26604e17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jsp-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
