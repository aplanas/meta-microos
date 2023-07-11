SUMMARY = "Javadoc for httpcomponents-asyncclient"
DESCRIPTION = "This package contains javadoc for httpcomponents-asyncclient."
LICENSE = "Apache-2.0"

PV = "4.1.4"

RPM_NAME = "httpcomponents-asyncclient-javadoc-4.1.4-3.10.noarch.rpm"
RPM_HASH = "1ae761d3a151de53817d41fc7f13112736e0b753e46959058ca1aa8aba0ed5e8f7a0b2bbae454d910f93a8ee561eec60aaca5f9b8135e6d3f822672af5ca40b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpcomponents-asyncclient-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
