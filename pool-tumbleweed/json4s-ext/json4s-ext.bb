SUMMARY = "The json4s ext module"
DESCRIPTION = "Json4s is a common AST for Scala JSON parsers. \
 \
This package contains the ext module."
LICENSE = "Apache-2.0"

PV = "3.6.7"

RPM_NAME = "json4s-ext-3.6.7-1.17.noarch.rpm"
RPM_HASH = "c8cc5fe5beadda0269e57cd7da1ff51edba8df9f666b8e18dbec13a57a1a08e71c29034e977df7dad2a32b51091e6f21e99b478fe6366c58e9ef4d81d167dcb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "json4s-ext \
mvn-org.json4s-json4s-ext-2.10 \
mvn-org.json4s-json4s-ext-2.10-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-joda-time-joda-time \
mvn-org.joda-joda-convert \
mvn-org.scala-lang-scala-library"

inherit rpm
