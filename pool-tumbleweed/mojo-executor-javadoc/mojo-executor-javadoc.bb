SUMMARY = "Javadoc for mojo-executor"
DESCRIPTION = "API documentation for mojo-executor."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "mojo-executor-javadoc-2.4.0-1.3.noarch.rpm"
RPM_HASH = "f71f7e5a8b1a81f3f80143d030e30b80294ab1a7b276bb3514bd0037d01c86f680f0be622d7e7fcef30649bc9ae66542bb744470cf9c4922296ba2a5d9d41ece"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mojo-executor-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
