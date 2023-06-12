SUMMARY = "API documentation for plexus-languages"
DESCRIPTION = "API documentation for plexus-languages."
LICENSE = "Apache-2.0"

PV = "1.1.1"

RPM_NAME = "plexus-languages-javadoc-1.1.1-2.6.noarch.rpm"
RPM_HASH = "44cfcb4c10531b75ccdc6a695fe205c344280e6ca24d1ba31134e4eef654d932858f27a383d1bca756a121e3c7fa8395b66f5e36aab2f2c72ed5548f01d3748e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-languages-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
