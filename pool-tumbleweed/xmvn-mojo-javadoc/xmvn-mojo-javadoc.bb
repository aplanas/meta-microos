SUMMARY = "API documentation for xmvn-mojo"
DESCRIPTION = "This package provides API documentation for xmvn-mojo."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-mojo-javadoc-4.2.0-2.1.noarch.rpm"
RPM_HASH = "017c2f3cc88172b4fbea707268d8c70fd01d5cdd2dfc319c1b2550b1ce16ae7af7bacd1cead3916e9fb3e00d8f6bc7ea7385c72c1fa6f024fa7b53dd65aac43e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmvn-mojo-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
