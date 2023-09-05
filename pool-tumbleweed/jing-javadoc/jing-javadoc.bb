SUMMARY = "Javadoc API documentation for Jing"
DESCRIPTION = "Javadoc API documentation for Jing."
LICENSE = "BSD-3-Clause"

PV = "20220510"

RPM_NAME = "jing-javadoc-20220510-4.1.noarch.rpm"
RPM_HASH = "d21044e6dd10c7b65a03b6ed2504016773b43f27d1b82e790a689494f4f4bd27c611bf978410bda27786723378528d24660d0b6a2ce8e28f08f2ee5fead6267f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jing-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
