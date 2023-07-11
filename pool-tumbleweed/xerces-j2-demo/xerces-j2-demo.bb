SUMMARY = "Demonstrations and samples for xerces-j2"
DESCRIPTION = "Demonstrations and samples for xerces-j2."
LICENSE = "Apache-2.0 & W3C"

PV = "2.12.2"

RPM_NAME = "xerces-j2-demo-2.12.2-2.7.noarch.rpm"
RPM_HASH = "c8dd0794123c959324518cf5a765feb608cee525b81af76358d103d88f09f971b9ab45e3e3bd451593accce8fa24c6d4bba3043e375a728cd2779b5ce73d353d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xerces-j2-demo"

RDEPENDS:${PN} += "xerces-j2"

inherit rpm
