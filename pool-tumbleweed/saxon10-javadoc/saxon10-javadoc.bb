SUMMARY = "Javadoc for saxon10"
DESCRIPTION = "Javadoc for saxon10."
LICENSE = "Apache-2.0 & MPL-2.0"

PV = "10.9"

RPM_NAME = "saxon10-javadoc-10.9-1.1.noarch.rpm"
RPM_HASH = "29001a83d283bb96157d7bab3cfcd21aeb65088bf629b102f44998d7d6872a208e08c0068f7599fbf4c07d6584a4e45eb0a6e6598680e73ff22b00bc642ba503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon10-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
