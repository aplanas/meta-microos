SUMMARY = "Development files for Scala"
DESCRIPTION = "Scala is a general purpose programming language for the JVM that blends \
object-oriented and functional programming. This package enables support for \
the Scala ant tasks."
LICENSE = "BSD-3-Clause & CC0-1.0 & SUSE-Public-Domain"

PV = "2.10.7"

RPM_NAME = "ant-scala-2.10.7-8.9.noarch.rpm"
RPM_HASH = "1b7f58b80b7361e3642b1bc64b24dcaf31a71b9726f83b63800029d087f6f59bcbace47b91563f13b6c625b5f447541d7a32e031cd722c7926af08f5499c760a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-scala \
config-ant-scala"

RDEPENDS:${PN} += "ant \
scala"

inherit rpm
