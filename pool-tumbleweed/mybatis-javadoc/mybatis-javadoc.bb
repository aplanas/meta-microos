SUMMARY = "Javadoc for mybatis"
DESCRIPTION = "This package contains javadoc for mybatis."
LICENSE = "Apache-2.0"

PV = "3.5.6"

RPM_NAME = "mybatis-javadoc-3.5.6-6.4.noarch.rpm"
RPM_HASH = "a24d820bf240552047abdab338f7d40dff81f82f54673ea48af943b61aba7fd8bf26c66a6e42e613ddcf8eaa88a69d288018f9d215bd03aad563806741fd8f9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mybatis-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
