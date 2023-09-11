SUMMARY = "Javadoc for maven-bundle-plugin"
DESCRIPTION = "API documentation for maven-bundle-plugin."
LICENSE = "Apache-2.0"

PV = "5.1.9"

RPM_NAME = "maven-bundle-plugin-javadoc-5.1.9-1.1.noarch.rpm"
RPM_HASH = "a6246fc04ea7c66d860b33866d9982683375a72c33ae95d3f79f2da82583a1e605221d2791d5567e8bd3a9d233ec47f82dc2de665c6da7ba8c986418af663135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-bundle-plugin-javadoc \
maven-plugin-bundle-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
