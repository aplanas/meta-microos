SUMMARY = "Javadoc for parboiled"
DESCRIPTION = "This package contains javadoc for parboiled."
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "parboiled-javadoc-1.1.6-5.7.noarch.rpm"
RPM_HASH = "c8e0049045f042b69c0d11df1da7897aa2ca8ac20807f687262920ae06679eb15fd41f0041a76181a8a2407a0d91784121d4bf01c9b0974107a53a574ff3c691"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "parboiled-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
