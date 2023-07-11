SUMMARY = "JavaDoc for multiverse"
DESCRIPTION = "JavaDoc for multiverse."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "multiverse-javadoc-0.7.0-3.11.noarch.rpm"
RPM_HASH = "b76c9e6f55a4e4573e6763e873bfcb618c3115efbbf13f29ce07fa4c71d53d0c7909bf44aa650bf94aea31caf3980fbc85a3fc4d339c665046138d1a39ac7918"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "multiverse-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
