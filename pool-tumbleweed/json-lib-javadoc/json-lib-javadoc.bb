SUMMARY = "Javadoc for json-lib"
DESCRIPTION = "API documentation for json-lib."
LICENSE = "Apache-2.0"

PV = "2.4"

RPM_NAME = "json-lib-javadoc-2.4-6.11.noarch.rpm"
RPM_HASH = "d211aca8caec0b0e1ea1842edf2abbaa2097ddfe862ec9e0c50d6564156195bc0ddfb6c819f10225aeb337e204ddc8d0fe584a4da1c39088e9ca618e1dfba45a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "json-lib-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
