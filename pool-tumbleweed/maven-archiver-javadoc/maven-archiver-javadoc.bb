SUMMARY = "Javadoc for maven-archiver"
DESCRIPTION = "Javadoc for maven-archiver."
LICENSE = "Apache-2.0"

PV = "3.6.1"

RPM_NAME = "maven-archiver-javadoc-3.6.1-1.1.noarch.rpm"
RPM_HASH = "67fa180781aadca4cbf19613e63fda8a4ce37d212aa2b900d72e2fd5dd578c425710f8a46ab96c8f765d754337b661d71c46eae4eaa449411e8130086b251565"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archiver-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
