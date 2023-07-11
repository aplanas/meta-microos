SUMMARY = "API documentation for snakeyaml"
DESCRIPTION = "This package contains API documentation for snakeyaml."
LICENSE = "Apache-2.0"

PV = "1.33"

RPM_NAME = "snakeyaml-javadoc-1.33-1.3.noarch.rpm"
RPM_HASH = "7b6e647f889f7d5c58303d28723e074c06c27d04352002b157aed95d4c43171694b020d58908e2017cfa6a590daf2cfca375fa265020f03e274c4fadeac25d67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "snakeyaml-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
