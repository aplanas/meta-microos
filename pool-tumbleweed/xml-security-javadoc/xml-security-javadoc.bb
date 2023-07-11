SUMMARY = "Javadoc for xml-security"
DESCRIPTION = "This package contains javadoc for xml-security."
LICENSE = "Apache-2.0"

PV = "2.1.7"

RPM_NAME = "xml-security-javadoc-2.1.7-3.11.noarch.rpm"
RPM_HASH = "a6db4957497f8b0cd1da43f020af02208b3000b588f7877bde21eac2902230505d549fb753f20d04985ed88cbbff1c2f99595efd29763bea5d40c49409292919"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xml-security-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
