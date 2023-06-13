SUMMARY = "API documentation for apache-commons-text"
DESCRIPTION = "This package contains the API documentation for apache-commons-text."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "apache-commons-text-javadoc-1.10.0-2.2.noarch.rpm"
RPM_HASH = "2e6fd3a86048d9440d3cf605d54d79dfdc71d498bdde201839fa5ce1d99fdd1b13f4f85a12d47da72e0cb788f281063a7751734d6ba7f4f1d3d5563a2d7b89a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-text-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
