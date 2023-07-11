SUMMARY = "Javadoc for jnr-netdb"
DESCRIPTION = "Javadoc for jnr-netdb."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "jnr-netdb-javadoc-1.2.0-1.14.noarch.rpm"
RPM_HASH = "5c33890bbefcdd609bbb116e91245b9b7930ff7b850123cf7e181ba25c2e389505b71ebcbb491165b48b275eb2e52f221dcce406d89c7f64a88d4158f49c5e62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-netdb-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
