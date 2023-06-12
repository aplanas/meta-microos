SUMMARY = "Javadoc for jffi"
DESCRIPTION = "This package contains the API documentation for jffi."
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "1.3.11"

RPM_NAME = "jffi-javadoc-1.3.11-1.1.noarch.rpm"
RPM_HASH = "637b471f1a67444cd4aad0095d58c48706ee8f3b398ae9a07cf0e9ae6f0fd0ff8003e5ab031df93ce42f7214cb23fb27b545f86e6f0e9b43c1bdf04aa0616b64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jffi-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
