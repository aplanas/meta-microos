SUMMARY = "API documentation for felix-bundlerepository"
DESCRIPTION = "This package contains the API documentation for felix-bundlerepository."
LICENSE = "Apache-2.0 & MIT"

PV = "2.0.10"

RPM_NAME = "felix-bundlerepository-javadoc-2.0.10-1.7.noarch.rpm"
RPM_HASH = "a6917ac453848e43f670e43abf920630336ce38e7a664422d5c0fea68d9e8696123f12dee25e087973b2460f9a719471ef6878456711ead6feec9c9058930869"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-bundlerepository-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
