SUMMARY = "Javadoc for xml-commons-resolver"
DESCRIPTION = "Javadoc for xml-commons-resolver."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "xml-commons-resolver-javadoc-1.2-4.7.noarch.rpm"
RPM_HASH = "c9a2a0786246ef8a66c856b8fd6d2a3b3e5c9e954d31c7528b4308e2492d9b2d91721d1d987b884e23036f600f34f7be9e4bbc3a063294568d5c1527ad26033a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xml-commons-resolver-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
