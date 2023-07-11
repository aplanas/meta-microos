SUMMARY = "API documentation for jgit"
DESCRIPTION = "API documentation for jgit."
LICENSE = "BSD-3-Clause"

PV = "5.11.0"

RPM_NAME = "jgit-javadoc-5.11.0-7.2.noarch.rpm"
RPM_HASH = "0f7c30e4509e1e9f247ef18fa8d51e67205b1bf51440be29b885be86a2a93de238414e41b84482dd10a45978a8b701d7658d2f11df5f9e706eaa7c8d8db2d23c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jgit-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
