SUMMARY = "API documentation for xmvn-tools"
DESCRIPTION = "This package provides API documentation for xmvn-tools."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-tools-javadoc-4.2.0-2.1.noarch.rpm"
RPM_HASH = "f668cc0fb4718c5c9d71270c8fab52118b9ed15c1c39ec42821842d8426bf6e28d710bcaf4ba8ca6aa02a8c501872d5209f00530a178be551a0ff902ddc813ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmvn-tools-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
