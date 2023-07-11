SUMMARY = "Library for describing binary formats for Scala types"
DESCRIPTION = " \
SBinary is a library for describing binary protocols, in the form of \
mappings between Scala types and binary formats. It can be used as a \
robust serialization mechanism for Scala objects or a way of dealing \
with existing binary formats found in the wild. \
 \
It started out life as a loose port of Haskell's Data.Binary. It's \
since evolved a bit from there to take advantage of the features Scala \
implicits offer over Haskell type classes, but the core idea has \
remained the same."
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "sbinary-0.4.2-4.2.noarch.rpm"
RPM_HASH = "1821c0570fd07845a218913fb924932a58e1a4d4966d40f85412e5b71717e25f115a543dc4755cd4ed37dac9ba443e191a3de55c4d703bee901483458b15baca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.scala-tools.sbinary-sbinary-2.10 \
mvn-org.scala-tools.sbinary-sbinary-2.10-pom- \
sbinary"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-org.scala-lang-scala-library \
scala"

inherit rpm
