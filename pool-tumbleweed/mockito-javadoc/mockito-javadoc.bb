SUMMARY = "Javadocs for mockito"
DESCRIPTION = "This package contains the API documentation for mockito."
LICENSE = "MIT"

PV = "1.10.19"

RPM_NAME = "mockito-javadoc-1.10.19-5.7.noarch.rpm"
RPM_HASH = "fc07e030826c068337f6e3169bde1dc560349721a4073ab6364842cbe5d71c809af84bdd6159a35632fda1e0b8c9dd790fc34f01a2e7d59ffad41cf9bbec7e46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mockito-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
