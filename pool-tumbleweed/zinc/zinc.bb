SUMMARY = "Incremental scala compiler"
DESCRIPTION = "Zinc is a stand-alone version of sbt's incremental compiler."
LICENSE = "Apache-2.0"

PV = "0.3.15"

RPM_NAME = "zinc-0.3.15-3.13.noarch.rpm"
RPM_HASH = "ac7964a563ffaf45d29051e50b3fcc6d4f46e3fb4e02ca19d4c9d04a764d2135253627125e98da82782636365f4be49f554a636c45fca90942f90cf0ca38b8bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.typesafe.zinc-zinc \
mvn-com.typesafe.zinc-zinc-pom- \
zinc"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.scala-lang-scala-library \
mvn-org.scala-sbt-incremental-compiler \
sbt"

inherit rpm
