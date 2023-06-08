SUMMARY = "API documentation for apache-commons-fileupload"
DESCRIPTION = "This package contains the API documentation for apache-commons-fileupload."
LICENSE = "Apache-2.0"

PV = "1.4"

RPM_NAME = "apache-commons-fileupload-javadoc-1.4-2.6.noarch.rpm"
RPM_HASH = "b9dcea6a10da390a5ad37cd54f1a4c2231101a5e5ac2f8c36c29a25749a70cf83b42ca853f167c552fc08fbd29265c4423c5d8a1dd09d6eb4cf50763a9ae8a34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-fileupload-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
