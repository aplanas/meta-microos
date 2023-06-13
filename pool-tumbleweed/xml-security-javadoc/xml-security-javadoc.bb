SUMMARY = "Javadoc for xml-security"
DESCRIPTION = "This package contains javadoc for xml-security."
LICENSE = "Apache-2.0"

PV = "2.1.7"

RPM_NAME = "xml-security-javadoc-2.1.7-3.10.noarch.rpm"
RPM_HASH = "9f3f37ca153111d05e32a6232927aa0c51f8f71b0b15635708de09f5c25b332cd183db1b9c8a99f2636dd74cb16ab290c793c662d60d1257979a0b8cce1bc15d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xml-security-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
