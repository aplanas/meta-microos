SUMMARY = "API documentation for xmvn-tools"
DESCRIPTION = "This package provides API documentation for xmvn-tools."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-tools-javadoc-4.2.0-3.1.noarch.rpm"
RPM_HASH = "510e54e009ee91d1cd2a7e7518e9a4ffc5eea490ff78cf19babff2d6fd7700d9a58f8bf715c9ad0487a76e04e4ab3cba7c036aafbe8423eca9027b1e23f41f30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmvn-tools-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
