SUMMARY = "Javadoc for jnr-netdb"
DESCRIPTION = "Javadoc for jnr-netdb."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "jnr-netdb-javadoc-1.2.0-1.13.noarch.rpm"
RPM_HASH = "2264bfd8aac524b9a40673a4aa98a8be58b663a22a262df4bf51bb0000bda9f0e0d300a5c984291af654105a3a7a8db4d0eaadb6140b2eed910bf3c7aba07f4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-netdb-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
