SUMMARY = "API documentation for os-maven-plugin"
DESCRIPTION = "This package provides API documentation for os-maven-plugin."
LICENSE = "Apache-2.0"

PV = "1.7.0"

RPM_NAME = "os-maven-plugin-javadoc-1.7.0-3.9.noarch.rpm"
RPM_HASH = "c3e0eca2ac5af877ef659a1abca18d6da7de9fc1b9e31ff1cc96e4062962a4476e9e065d9daa710a040001f1dfdaf32575f4f8d2f0c2b8b907c72fb15b8b89a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "os-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
