SUMMARY = "Javadoc for xml-commons-apis"
DESCRIPTION = "Javadoc for xml-commons-apis."
LICENSE = "Apache-2.0 & W3C & SUSE-Public-Domain"

PV = "1.4.01"

RPM_NAME = "xml-commons-apis-javadoc-1.4.01-4.7.noarch.rpm"
RPM_HASH = "3bf8fc97d8da766a8c2b4ecb736f7e908d0a2339a02073f7fa77f06890c11b9bb1dbcfebcdd91e23104386bd8ee53ebd221228282372b3e37b5de2899d98dc7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xml-commons-apis-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
