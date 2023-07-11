SUMMARY = "Scala Pickling"
DESCRIPTION = "Scala Pickling is an automatic serialization framework made for Scala. \
It's fast, boilerplate-free, and allows users to easily swap in/out \
different serialization formats (such as binary, or JSON), or even to \
provide their own custom serialization format."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "scala-pickling-0.10.1-2.10.aarch64.rpm"
RPM_HASH = "1e5375acf523d84aadf1e9c5ec269dcdabdf2b06b9ab3546928e11ce6edc2c37898323afb22a12accb6a02fa7c5840ae95aaecc2f1920325e898bee038aceef1"

RPROVIDES:${PN} += "mvn-org.scala-lang.modules-scala-pickling-2.10 \
mvn-org.scala-lang.modules-scala-pickling-2.10-pom- \
scala-pickling"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.scala-lang-scala-compiler \
mvn-org.scala-lang-scala-library \
mvn-org.scala-lang-scala-reflect \
mvn-org.scalamacros-quasiquotes-2.10"

inherit rpm
