SUMMARY = "API documentation for sqlite-jdbc"
DESCRIPTION = "API documentation for sqlite-jdbc."
LICENSE = "Apache-2.0"

PV = "3.43.0.0"

RPM_NAME = "sqlite-jdbc-javadoc-3.43.0.0-2.1.noarch.rpm"
RPM_HASH = "5189aac6537f441b88f999b787bb8ef86c32463d3964389e5f6df8beaf067b8f859a05953381d2a5a6ff95e53833f234aafba5179d1bdb9ae38ab196a875eda1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sqlite-jdbc-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
