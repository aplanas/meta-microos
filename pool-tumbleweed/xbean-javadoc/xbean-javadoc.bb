SUMMARY = "API documentation for xbean"
DESCRIPTION = "This package provides API documentation for xbean."
LICENSE = "Apache-2.0"

PV = "4.20"

RPM_NAME = "xbean-javadoc-4.20-1.7.noarch.rpm"
RPM_HASH = "d063e3ddb830b4cf7b9bf4686ef712589b4e2f8a3ce65df455bb3e090de26e634987a0d32fd867dd454b274a130e27c2351d36de62bf2233107c838a03fa8d7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xbean-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
