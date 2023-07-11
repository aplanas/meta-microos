SUMMARY = "Javadoc for plexus-sec-dispatcher"
DESCRIPTION = "API documentation for plexus-sec-dispatcher."
LICENSE = "Apache-2.0"

PV = "2.0"

RPM_NAME = "plexus-sec-dispatcher-javadoc-2.0-3.5.noarch.rpm"
RPM_HASH = "4a32203972804bd6869f9f8cbe8a3b354508074aa59b28081ea26df46afa0c8c0146e229930eb56b0a8f1c7082d5f1558e12874c8102e43b4a6f1273b806621f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-sec-dispatcher-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
