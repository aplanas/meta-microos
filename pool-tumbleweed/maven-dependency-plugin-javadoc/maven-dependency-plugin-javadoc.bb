SUMMARY = "API documentation for maven-dependency-plugin"
DESCRIPTION = "API documentation for maven-dependency-plugin."
LICENSE = "Apache-2.0"

PV = "3.1.2"

RPM_NAME = "maven-dependency-plugin-javadoc-3.1.2-1.17.noarch.rpm"
RPM_HASH = "2eb6e430dff3195ed1fd210d963593201e11811fdbd0ffdc8322d83a39d627c3bbf1725aacca87b5eadafe19895999a57cf9649cb1492964961712a3adf4efb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-dependency-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
