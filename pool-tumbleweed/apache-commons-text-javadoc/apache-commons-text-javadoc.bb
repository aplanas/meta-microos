SUMMARY = "API documentation for apache-commons-text"
DESCRIPTION = "This package contains the API documentation for apache-commons-text."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "apache-commons-text-javadoc-1.10.0-2.3.noarch.rpm"
RPM_HASH = "1f646c24877a0e6032ee4fa79f9ed4b2691b09ac24d3e4fef161846fdd4d7d2a3ac22f5ef20987c53355a96f936941de699836a3b603960f84c906988822b9f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-text-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
