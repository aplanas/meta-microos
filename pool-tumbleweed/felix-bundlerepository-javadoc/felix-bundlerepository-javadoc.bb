SUMMARY = "API documentation for felix-bundlerepository"
DESCRIPTION = "This package contains the API documentation for felix-bundlerepository."
LICENSE = "Apache-2.0 & MIT"

PV = "2.0.10"

RPM_NAME = "felix-bundlerepository-javadoc-2.0.10-1.6.noarch.rpm"
RPM_HASH = "69dc2ee4efb0055f3619e8af196c0a3feaf76f190dcaab27e9bb21cd037f543ce8f4f35fa43cd7225512c58561f32f37073cd660d3ed12953127b36ce1dbdbb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-bundlerepository-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
