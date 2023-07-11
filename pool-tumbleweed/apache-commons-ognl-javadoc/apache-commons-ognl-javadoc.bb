SUMMARY = "API documentation for apache-commons-ognl"
DESCRIPTION = "This package contains the API documentation for apache-commons-ognl."
LICENSE = "Apache-2.0"

PV = "4.0~20191021git51cf8f4"

RPM_NAME = "apache-commons-ognl-javadoc-4.0~20191021git51cf8f4-4.5.noarch.rpm"
RPM_HASH = "cb125c36c440a31d352e7d3c1cea509b0a080937106b93b49d08964e9d79797d47cbbdb74b620b0be113f4cad63d28912d6162039ffd4674d1c5db33323702ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-ognl-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
