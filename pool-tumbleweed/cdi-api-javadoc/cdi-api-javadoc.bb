SUMMARY = "Javadoc for cdi-api"
DESCRIPTION = "This package contains the API documentation for cdi-api."
LICENSE = "Apache-2.0"

PV = "2.0.2"

RPM_NAME = "cdi-api-javadoc-2.0.2-2.3.noarch.rpm"
RPM_HASH = "fb4e011ebe5a2fd227665614fc3d8a7dc9ff8e31e6a4378585a5a5b1fd1802a89ffea755790f67dfb654c49e1e749407db66b128d15eface66776cffdcfe6644"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cdi-api-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
