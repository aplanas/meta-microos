SUMMARY = "Javadoc for string-template-maven-plugin"
DESCRIPTION = "API documentation for string-template-maven-plugin."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "string-template-maven-plugin-javadoc-1.1-2.11.noarch.rpm"
RPM_HASH = "588d9e46ee35ae72d0a37b300b4ff677357c9c6cd7dadbf3b72797e5dcaf30f8a271766b974f999623c66a7893c6f4c1f2d9765a4b1a212aa02c7f89c9dc2851"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "string-template-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
