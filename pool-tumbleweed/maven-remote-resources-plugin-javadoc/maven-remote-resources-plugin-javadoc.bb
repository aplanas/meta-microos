SUMMARY = "Javadoc for maven-remote-resources-plugin"
DESCRIPTION = "API documentation for maven-remote-resources-plugin."
LICENSE = "Apache-2.0"

PV = "1.7.0"

RPM_NAME = "maven-remote-resources-plugin-javadoc-1.7.0-2.8.noarch.rpm"
RPM_HASH = "c5c28c0d5e3566dec8eb4f2322b369d46618cd98b25828a1b1b76c94e85e7dc772c61627e330b2e049bb9805649fb6f17710c6c15ae2299958eb0787a855315f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-remote-resources-plugin-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
