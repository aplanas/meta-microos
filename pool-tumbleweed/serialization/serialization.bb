SUMMARY = "Sbt wrapper around Scala pickling"
DESCRIPTION = "sbt serialization is a wrapper around Scala pickling focused \
on sbt's usage. In particular it provides: \
    * JSON format that's nice \
    * static-only core picklers"
LICENSE = "Apache-2.0"

PV = "0.1.2"

RPM_NAME = "serialization-0.1.2-1.17.noarch.rpm"
RPM_HASH = "bbc5f91a0d7a8116c2dbcc6352f075444c6eac11072205961d625797ba4ee9a3309789769fb5eaa73ccc7b8c37f4cc8e887b7dce4dac7163ef6ac425f758cb4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.scala-sbt-serialization-2.10 \
mvn-org.scala-sbt-serialization-2.10-pom- \
serialization"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.json4s-json4s-ast-2.10 \
mvn-org.scala-lang-scala-library \
mvn-org.scala-lang.modules-scala-pickling-2.10 \
mvn-org.typelevel-jawn-json4s-2.10 \
mvn-org.typelevel-jawn-parser-2.10"

inherit rpm
