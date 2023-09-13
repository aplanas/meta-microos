SUMMARY = "API documentation for woodstox-core"
DESCRIPTION = "This package contains the API documentation for woodstox-core."
LICENSE = "Apache-2.0"

PV = "6.2.8"

RPM_NAME = "woodstox-core-javadoc-6.2.8-3.1.noarch.rpm"
RPM_HASH = "4ed1d8a4331f12b2a6f23fece5e0f3a66b4e49f4fefa89dfb81f131bc477a190f2c6350442fce6ff4dd357e6501a5a6db790ece093b873d1c3a064cd7964075d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "woodstox-core-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
