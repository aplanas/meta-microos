SUMMARY = "The swing library for the Scala programming languages"
DESCRIPTION = "This package contains the swing library for the Scala programming languages. \
This library is required to develop GUI-related applications in Scala. \
The release provided by this package is not the original version from upstream \
because this version is not compatible with JDK 1.7."
LICENSE = "BSD-3-Clause & CC0-1.0 & SUSE-Public-Domain"

PV = "2.10.7"

RPM_NAME = "scala-swing-2.10.7-8.9.noarch.rpm"
RPM_HASH = "d07c2481111c983382c00c64a7e18a639b85690ee2479e2bfebe14cbd04d914abdf3c0cafe49af7deb813f8f7330e96ed5f49749722c054948297029f4deca2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.scala-lang-scala-swing \
mvn-org.scala-lang-scala-swing-pom- \
scala-swing"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem \
mvn-org.scala-lang-scala-library \
scala"

inherit rpm
