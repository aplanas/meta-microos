SUMMARY = "Javadoc for jackson-dataformat-xml"
DESCRIPTION = "This package contains API documentation for jackson-dataformat-xml."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-dataformat-xml-javadoc-2.13.3-1.7.noarch.rpm"
RPM_HASH = "0cceda984e69d84057de9cdc41bfa742223f427c20e842376c9b2322e9c859de7541f8db30a1bbad054020fa18ad5e74f5b67920d5b299f6dab8653e278857c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformat-xml-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
