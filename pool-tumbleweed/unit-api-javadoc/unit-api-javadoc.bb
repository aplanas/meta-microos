SUMMARY = "Javadoc for unit-api"
DESCRIPTION = "This package contains javadoc for unit-api."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "unit-api-javadoc-1.0-1.19.noarch.rpm"
RPM_HASH = "202a6f4054e57da87998c017aced225c454123afc7ba943ae9fc7aeaf70f3bbe531f17f9269111884c033f9bab68942a8f7ffff75fa7f86f46f3f33e1c44658c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "unit-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
