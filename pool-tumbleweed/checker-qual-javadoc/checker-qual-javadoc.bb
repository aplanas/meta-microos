SUMMARY = "API documentation for checker-qual"
DESCRIPTION = "This package provides API documentation for checker-qual."
LICENSE = "MIT"

PV = "3.22.0"

RPM_NAME = "checker-qual-javadoc-3.22.0-1.4.noarch.rpm"
RPM_HASH = "ca6c20eac4a0d313fc6629c77a0d668d79a4383d498132dc7d8601f662b95736f6c9f9ff987282110ca1b511973f62d18efe9e498eb3a29c2833cfea92b43cd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "checker-qual-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
