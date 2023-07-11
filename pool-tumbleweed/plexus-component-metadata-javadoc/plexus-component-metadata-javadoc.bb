SUMMARY = "API documentation for plexus-component-metadata"
DESCRIPTION = "API documentation for plexus-component-metadata."
LICENSE = "Apache-2.0 & MIT & xpp"

PV = "2.1.1"

RPM_NAME = "plexus-component-metadata-javadoc-2.1.1-4.2.noarch.rpm"
RPM_HASH = "c56da9013364a0dc91f54b7bc8ee4b321ee1e5925df1e6e691e5500ebd4c957621315805add13e0cda02f66d999fba18cb598e2045247d5504b1fd5d384c42f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-component-metadata-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
