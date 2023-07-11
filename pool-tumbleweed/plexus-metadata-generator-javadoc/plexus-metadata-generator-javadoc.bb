SUMMARY = "API documentation for plexus-metadata-generator"
DESCRIPTION = "API documentation for plexus-metadata-generator."
LICENSE = "Apache-2.0 & MIT & xpp"

PV = "2.1.1"

RPM_NAME = "plexus-metadata-generator-javadoc-2.1.1-4.2.noarch.rpm"
RPM_HASH = "a47760d09f5c4f77555c950efb788a7e9d03f050e5286c8f137d7659faa7b96428f8035ffa89cd330852fc27dbb2b78a7193a392ab58412de9cb70ad71a9ab29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-metadata-generator-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
