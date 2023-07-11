SUMMARY = "Javadoc for ant-contrib"
DESCRIPTION = "Api documentation for ant-contrib."
LICENSE = "Apache-2.0"

PV = "1.0b3"

RPM_NAME = "ant-contrib-javadoc-1.0b3-10.4.noarch.rpm"
RPM_HASH = "f779172d461ff1a3b2a26fbf681bf01f2ef6816de173a98512301d91208b8ec03384fc80268d602ecee12a8ff6fabd893d966d101d68d5297e4949f8c561dbf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-contrib-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem \
jpackage-utils"

inherit rpm
