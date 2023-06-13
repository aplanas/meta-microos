SUMMARY = "Documentation for the Scala programming language"
DESCRIPTION = "Scala is a general purpose programming language for the JVM that blends \
object-oriented and functional programming. This package provides \
reference and API documentation for the Scala programming language."
LICENSE = "BSD-3-Clause & CC0-1.0 & SUSE-Public-Domain"

PV = "2.10.7"

RPM_NAME = "scala-apidoc-2.10.7-8.8.noarch.rpm"
RPM_HASH = "794667995831a58b49b62f32a737684b1b0e276b3b99dc248deec5d347f6993bdb9378615685cf72af49282498db37195b30f3de05b5ff11879c841efd582e87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scala-apidoc"

RDEPENDS:${PN} += ""

inherit rpm
