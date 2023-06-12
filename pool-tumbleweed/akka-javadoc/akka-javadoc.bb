SUMMARY = "Javadoc for akka"
DESCRIPTION = "This package contains javadoc for akka."
LICENSE = "Apache-2.0"

PV = "2.3.16"

RPM_NAME = "akka-javadoc-2.3.16-8.9.noarch.rpm"
RPM_HASH = "9b1e07d4dc75e9e5ee7c118565c1b412417112b058041c573797e8c58eb5d7a24662c0625f583ced2149fa2f35660a943789fc0abe595d083461c336003ef8f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "akka-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
