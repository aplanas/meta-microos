SUMMARY = "API documentation for apache-commons-csv"
DESCRIPTION = "This package contains the API documentation for apache-commons-csv."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "apache-commons-csv-javadoc-1.10.0-2.1.noarch.rpm"
RPM_HASH = "9ec9b865e6c15832ef2ef4841a4c066051990981ef964805df32d4d031d9e1aae4ba25894a400a2c2677f5aebe6fae6d255e5da3472080cea018a29f7cf80ac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-csv-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
