SUMMARY = "Javadoc for maven-plugin-plugin"
DESCRIPTION = "API documentation for maven-plugin-plugin."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-plugin-javadoc-3.6.0-7.1.noarch.rpm"
RPM_HASH = "75ad76b326c7f9f4ea7636fa1a36b371d6a9a99b7f1889630682ff2021c0cae05cc00cac22a58e251b51dae70a85677661d6e4bb3e3b139acf82e2f7f9986a4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
