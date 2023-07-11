SUMMARY = "Javadoc for felix-gogo-runtime"
DESCRIPTION = "This package contains the API documentation for felix-gogo-runtime."
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "felix-gogo-runtime-javadoc-1.1.0-4.3.noarch.rpm"
RPM_HASH = "c9d89d3c16f359841599abf341e2141066b9baca708674402028c3818ade130d24da7ce0480fe3565a834ed11ed1fba2de08fca280528d6852367a394038c3a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-gogo-runtime-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
