SUMMARY = "Javadoc for maven-native"
DESCRIPTION = "This package contains javadoc for maven-native."
LICENSE = "Apache-2.0 & MIT"

PV = "1.0~alpha11"

RPM_NAME = "maven-native-javadoc-1.0~alpha11-4.8.noarch.rpm"
RPM_HASH = "b9f920d8c98534a412f5cee95a0b4efd60eae3781455a4deedc206b0738410e531aa71b904eb091215c6620bc76c6a3a962d96a81d8e58d87e9ecf03a0d5a569"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-native-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
