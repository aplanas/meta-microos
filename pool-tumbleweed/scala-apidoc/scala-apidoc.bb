SUMMARY = "Documentation for the Scala programming language"
DESCRIPTION = "Scala is a general purpose programming language for the JVM that blends \
object-oriented and functional programming. This package provides \
reference and API documentation for the Scala programming language."
LICENSE = "BSD-3-Clause & CC0-1.0 & SUSE-Public-Domain"

PV = "2.10.7"

RPM_NAME = "scala-apidoc-2.10.7-8.9.noarch.rpm"
RPM_HASH = "efd379657d8a4deaf2b085e306a0a15495d1ff4abdc211935797116b1ec3148f1ba52ab2689d5fd87f73f8cb9af38f99cbbcdb78c3cab2ba6f0e2bf57f0b1284"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scala-apidoc"

RDEPENDS:${PN} += ""

inherit rpm
