SUMMARY = "Development files for Scala"
DESCRIPTION = "Scala is a general purpose programming language for the JVM that blends \
object-oriented and functional programming. This package enables support for \
the Scala ant tasks."
LICENSE = "BSD-3-Clause & CC0-1.0 & SUSE-Public-Domain"

PV = "2.10.7"

RPM_NAME = "ant-scala-2.10.7-8.8.noarch.rpm"
RPM_HASH = "c3940f345e0c448b82a007824b7752fa53b23d54e235d8daf2a27365a4eafe2a5fc7779cc5a7cf99f6898f730dea17654e37c4e19bc2b3305ed0127a347769b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-scala \
config(ant-scala)"

RDEPENDS:${PN} += "ant \
scala"

inherit rpm
