SUMMARY = "API documentation for apache-commons-csv"
DESCRIPTION = "This package contains the API documentation for apache-commons-csv."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "apache-commons-csv-javadoc-1.10.0-1.1.noarch.rpm"
RPM_HASH = "5814298016f8a0e0667093a0c1702e3c7824586f9b3c06657fd1e4a9c532aca015a2323df64e8696608c118e915ab3fb4c6f33a7dbd5a993ce91f1667829ad8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-csv-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
