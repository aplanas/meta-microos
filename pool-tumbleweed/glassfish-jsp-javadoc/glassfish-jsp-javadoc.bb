SUMMARY = "API documentation for glassfish-jsp"
DESCRIPTION = "API documentation for glassfish-jsp."
LICENSE = "Apache-2.0 & (CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0)"

PV = "2.3.4"

RPM_NAME = "glassfish-jsp-javadoc-2.3.4-3.1.noarch.rpm"
RPM_HASH = "90451386500dd9148627f2407a27f622d29c4ce02e959e90a2b497a19ab531651ed63195aedc948cf63f97d4582ba56f77e51090fb9277e0fcdc1ddcd628f784"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jsp-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
