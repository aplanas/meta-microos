SUMMARY = "API documentation for apache-commons-io"
DESCRIPTION = "This package provides API documentation for apache-commons-io."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "apache-commons-io-javadoc-2.11.0-2.5.noarch.rpm"
RPM_HASH = "3dadf5eb0bdacbd8658b0366094c3c044d33b4a542b61fab7122315a946d7780fb3627f4de7b8faa581c99732da6fa664ce4e8d54cf18be4d699c9eec78b5ff7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-io-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
