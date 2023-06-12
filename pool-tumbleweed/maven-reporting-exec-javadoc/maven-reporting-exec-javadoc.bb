SUMMARY = "API documentation for maven-reporting-exec"
DESCRIPTION = "The API documentation of maven-reporting-exec."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "maven-reporting-exec-javadoc-1.6.0-1.10.noarch.rpm"
RPM_HASH = "8b12d1479a7dcc4fbed4a70d005fc55946c5eb69d700c91f48deeb9589a7b7ca28d54d85d3f50d1611d44c80c7b72810e5a811a9b78692ef40b02b1ec10b982b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-reporting-exec-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
