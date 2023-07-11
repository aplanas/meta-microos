SUMMARY = "API documentation for jgraphx"
DESCRIPTION = "API documentation for jgraphx."
LICENSE = "BSD-3-Clause"

PV = "4.2.2"

RPM_NAME = "jgraphx-javadoc-4.2.2-2.6.noarch.rpm"
RPM_HASH = "1ba6d3a236ce40d93bff5c6141d8e69f8bc5c5ed004de6f87bd537ed68fd9b28b398c7d3d6bab268764b470c316409dca15e90da675d46e5b2ad935753eceb7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jgraphx-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
