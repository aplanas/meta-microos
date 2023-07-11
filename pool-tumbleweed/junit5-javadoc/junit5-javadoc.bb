SUMMARY = "Javadoc for junit5"
DESCRIPTION = "Junit5 API documentation."
LICENSE = "EPL-2.0"

PV = "5.8.2"

RPM_NAME = "junit5-javadoc-5.8.2-1.10.noarch.rpm"
RPM_HASH = "06bb7a5758edfdcfd2cef679a3595332198d557c998f33414e2a1445b124e1e258db2450d5d934af6bc49fc21e0852897f4b993cdd9c74a1790b552732ac2bc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "junit5-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
