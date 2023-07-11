SUMMARY = "Javadoc for plexus-resources"
DESCRIPTION = "API documentation for plexus-resources."
LICENSE = "MIT"

PV = "1.0~a7"

RPM_NAME = "plexus-resources-javadoc-1.0~a7-2.7.noarch.rpm"
RPM_HASH = "352c238da4c16e8da60d5bee1fcc85a71654b107314167d4604bcf58aae0c6a6093ecde4b358bdc299295c74c3cb21c81b7fdbc5a59997b2dbfcf77b20a6afed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-resources-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
