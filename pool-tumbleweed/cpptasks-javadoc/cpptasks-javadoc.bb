SUMMARY = "Javadoc for cpptasks"
DESCRIPTION = "Javadoc documentation for Javadoc for cpptasks."
LICENSE = "Apache-2.0"

PV = "1.0b5"

RPM_NAME = "cpptasks-javadoc-1.0b5-7.14.noarch.rpm"
RPM_HASH = "774effc503a1fb81b36b45e62b188027fe1e9835682c7c0ae9e9f31e15d3f7fd9c619a5b58493180406e4ba61a47e4aabc817346567e84603172a1e0bf2f35c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpptasks-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
