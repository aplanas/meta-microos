SUMMARY = "Javadoc for httpcomponents-asyncclient"
DESCRIPTION = "This package contains javadoc for httpcomponents-asyncclient."
LICENSE = "Apache-2.0"

PV = "4.1.4"

RPM_NAME = "httpcomponents-asyncclient-javadoc-4.1.4-3.9.noarch.rpm"
RPM_HASH = "b7312ca8c3e939cf8d1699f641a199de1ad61df4f373889cf41bb5a6b4608fbf2616d7bd2c2606ef1e89142896036668b2a93095002c76abde390b3e9695346f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpcomponents-asyncclient-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
