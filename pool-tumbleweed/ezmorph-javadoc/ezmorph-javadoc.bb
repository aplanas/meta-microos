SUMMARY = "Javadoc for ezmorph"
DESCRIPTION = "API documentation for ezmorph."
LICENSE = "Apache-2.0"

PV = "1.0.6"

RPM_NAME = "ezmorph-javadoc-1.0.6-4.11.noarch.rpm"
RPM_HASH = "0756c794cb0655992eafde1b70bdc8889e1a27366a5ad8738e8b9a50cc77f59346ac6d203fe58d0d785e5f43535a17119d29052e2aa469cacfa9c1f28b967dc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ezmorph-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
