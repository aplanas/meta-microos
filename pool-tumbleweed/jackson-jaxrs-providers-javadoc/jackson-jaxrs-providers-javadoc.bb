SUMMARY = "Javadoc for jackson-jaxrs-providers"
DESCRIPTION = "This package contains API documentation for jackson-jaxrs-providers."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-jaxrs-providers-javadoc-2.13.3-1.8.noarch.rpm"
RPM_HASH = "c819f2f0c14c2db25af0899e9fbce3ecd7506cfd1fc908f52d696582172161d63d04628d997533514101a064943b6e9734e24e25082ac2b85a50ca9eaec43a47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-providers-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
