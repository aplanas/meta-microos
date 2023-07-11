SUMMARY = "Javadoc for maven-jar-plugin"
DESCRIPTION = "API documentation for maven-jar-plugin."
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "maven-jar-plugin-javadoc-3.2.2-3.8.noarch.rpm"
RPM_HASH = "9123de0c5df24b0c814307ba1fb4004206f8a4ec045f8b692978851fd563d5cafe84e37ec2b2960acae41a60661e98159a9f740c5266cf22e7730dde7796db4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-jar-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
