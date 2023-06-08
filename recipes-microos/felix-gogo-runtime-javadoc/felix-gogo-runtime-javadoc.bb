SUMMARY = "Javadoc for felix-gogo-runtime"
DESCRIPTION = "This package contains the API documentation for felix-gogo-runtime."
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "felix-gogo-runtime-javadoc-1.1.0-4.2.noarch.rpm"
RPM_HASH = "af6621a36d675d9c2df900490599cb6a20074cea3762d484ce9a12898c44c3f4af82069c2d37c9657b1e00be6b9d2336778aadb598e5a95ab6dae26174189efe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-gogo-runtime-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
