SUMMARY = "Javadoc for pegdown"
DESCRIPTION = "This package contains javadoc for pegdown."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "pegdown-javadoc-1.4.2-2.7.noarch.rpm"
RPM_HASH = "d90d8bf6771b6f33a09d52a46c621a94d3983a15102e4f8220fbaf0fda5217c004753031f7045919672b3c840f224cf3535b96cb7ee80fe5dcace312515c758e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pegdown-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
