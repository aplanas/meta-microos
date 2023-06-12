SUMMARY = "API documentation for janino"
DESCRIPTION = "API documentation for janino."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "janino-javadoc-3.1.6-1.10.noarch.rpm"
RPM_HASH = "47919bf780df2bc7b80b775bd7528c7656dabd5b514063bb9d66f6bb4b7d7bd38caf21bff3bb5274f94becf1605aee4df4e9b7fcc21dd53b04bcea273da3af97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "janino-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
