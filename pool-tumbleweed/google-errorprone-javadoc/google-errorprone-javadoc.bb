SUMMARY = "Javadoc for google-errorprone"
DESCRIPTION = "This package contains the API documentation for google-errorprone."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "google-errorprone-javadoc-2.11.0-2.2.noarch.rpm"
RPM_HASH = "79ed5440852297edbae6b07f51b4b5c6133efbeab314e09c16077de89e14530e397033717e49a75297650e71bb67dc169392de93b0fc5dcfc957b6bd7974ad94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-errorprone-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
