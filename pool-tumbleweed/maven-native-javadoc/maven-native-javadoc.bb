SUMMARY = "Javadoc for maven-native"
DESCRIPTION = "This package contains javadoc for maven-native."
LICENSE = "Apache-2.0 & MIT"

PV = "1.0~alpha11"

RPM_NAME = "maven-native-javadoc-1.0~alpha11-4.9.noarch.rpm"
RPM_HASH = "99fd7dec503f3c517e412b62119b831e28e731ee5232d68086b24bf0aed4eeefe019d4ffa792926dabd163dda59ecc20263f9953cad8f6ea89293cee53ba204b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-native-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
