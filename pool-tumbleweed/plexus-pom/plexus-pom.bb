SUMMARY = "Root Plexus Projects POM"
DESCRIPTION = "The Plexus project provides a full software stack for creating and \
executing software projects.  This package provides parent POM for \
Plexus packages."
LICENSE = "Apache-2.0"

PV = "14"

RPM_NAME = "plexus-pom-14-1.1.noarch.rpm"
RPM_HASH = "1f0605519b7ad57efc230261bcdbbdec88910fe25810ac71f0b04ff5e48027a66ed9112a38d4096ad018945043e56de16386d018bbf215e0a800913d64025318"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-pom- \
plexus-pom"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
