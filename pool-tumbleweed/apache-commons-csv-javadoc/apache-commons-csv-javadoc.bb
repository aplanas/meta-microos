SUMMARY = "API documentation for apache-commons-csv"
DESCRIPTION = "This package contains the API documentation for apache-commons-csv."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "apache-commons-csv-javadoc-1.10.0-1.2.noarch.rpm"
RPM_HASH = "a3a0fa9bb08725c7022fcf8154f312088952eed2766f6db13e081e9900f6e30be91aba9bd69f096ca1f52441862a1338ac7561b9a6ba7b1149b85d805e8d4f48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-csv-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
