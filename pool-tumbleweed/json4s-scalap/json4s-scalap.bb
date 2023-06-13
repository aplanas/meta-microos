SUMMARY = "The json4s scalap module"
DESCRIPTION = "Json4s is a common AST for Scala JSON parsers. \
 \
This package contains the scalap module."
LICENSE = "Apache-2.0"

PV = "3.6.7"

RPM_NAME = "json4s-scalap-3.6.7-1.16.noarch.rpm"
RPM_HASH = "4d28fbae870baee1d2a97bbe7bdb2ec553c189798b41ba7af0cd3442043b78739104facc367d533ca5496cc10a04d75fe8efaed30a2c800e965eb7324f0b4bf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "json4s-scalap \
mvn(org.json4s:json4s-scalap_2.10) \
mvn(org.json4s:json4s-scalap_2.10:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.scala-lang:scala-library)"

inherit rpm
