SUMMARY = "Subversion Client Adapter"
DESCRIPTION = "SVNClientAdapter is a high-level Java API for Subversion."
LICENSE = "Apache-2.0"

PV = "6.7.1"

RPM_NAME = "netbeans-svnclientadapter-6.7.1-22.7.noarch.rpm"
RPM_HASH = "67cb37396146052ae85389decc4655eedfbfadbd54f384c556f993b65a246101bacf1e45cb108ad73f81db50403084dfbaea538708dacdeaec9583ac5ec45068"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netbeans-svnclientadapter"

RDEPENDS:${PN} += "java \
javapackages-tools \
subversion"

inherit rpm
