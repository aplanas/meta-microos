SUMMARY = "Javadoc for maven-javadoc-plugin"
DESCRIPTION = "API documentation for maven-javadoc-plugin."
LICENSE = "Apache-2.0"

PV = "3.3.2"

RPM_NAME = "maven-javadoc-plugin-javadoc-3.3.2-4.4.noarch.rpm"
RPM_HASH = "71c37175e3c9e155f01dc20aa8784c49101d90b80f2cc0eaaa3185a50800db53172f7583e54f39f9b59ab7ba6498d272eea35de55b20e2feb603999e80437d7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-javadoc-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
