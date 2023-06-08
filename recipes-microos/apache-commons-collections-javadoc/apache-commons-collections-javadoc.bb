SUMMARY = "Javadoc for apache-commons-collections"
DESCRIPTION = "Javadoc for apache-commons-collections."
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "apache-commons-collections-javadoc-3.2.2-7.4.noarch.rpm"
RPM_HASH = "5b04f2f8cbe099579def6ae60afe81548387c7c119aaa126f15901ac921e66ebafbbd8e84d7e6cc040ab3182f6354635bd4e0c8ba7bde3db3407aab256f5eb85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-collections-javadoc apache-commons-collections-testframework-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
