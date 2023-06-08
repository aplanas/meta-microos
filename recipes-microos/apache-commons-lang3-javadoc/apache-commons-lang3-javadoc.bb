SUMMARY = "Javadoc for apache-commons-lang3"
DESCRIPTION = "Javadoc for apache-commons-lang3."
LICENSE = "Apache-2.0"

PV = "3.12.0"

RPM_NAME = "apache-commons-lang3-javadoc-3.12.0-2.6.noarch.rpm"
RPM_HASH = "01f4cc9ecd08c9c66c387f04ee95ab35059c1326cf4de5a9c4abe61f05cab67ff852bb471493351b87447e7470c79101bbf9333e6a2857fed60a8b571a98d70a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-lang3-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
