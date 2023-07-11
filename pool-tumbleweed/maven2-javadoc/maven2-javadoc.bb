SUMMARY = "Javadoc for maven2"
DESCRIPTION = "Javadoc for maven2."
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "maven2-javadoc-2.2.1-3.9.noarch.rpm"
RPM_HASH = "073e5ca8b330565002a36faceb0df9f50e9deff73a50673d53b8694408403a7c527720ec4cad4734a77db1e264a46f33bc75eaaaf27b3ec5e2ecf1886cd770d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven2-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
