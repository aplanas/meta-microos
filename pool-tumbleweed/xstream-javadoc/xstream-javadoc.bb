SUMMARY = "Javadoc for xstream"
DESCRIPTION = "xstream API documentation."
LICENSE = "BSD-3-Clause"

PV = "1.4.20"

RPM_NAME = "xstream-javadoc-1.4.20-1.4.noarch.rpm"
RPM_HASH = "9e5c2ec28052bbd860baa90f55800aad11d4fa585db96d03607b22ffa9bb6b791e0e0825ecadddec5bcb73fc98e98c4dd62497ebbd983ca8ba479ed781015495"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xstream-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
