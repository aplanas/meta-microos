SUMMARY = "Javadoc for glassfish-dtd-parser"
DESCRIPTION = "This package contains javadoc for glassfish-dtd-parser."
LICENSE = "CDDL-1.1 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.4"

RPM_NAME = "glassfish-dtd-parser-javadoc-1.4-4.19.noarch.rpm"
RPM_HASH = "81015c6e35a78b116d4ba651ad6a0c6f610055177230ec6c1a60729649b32b5417b723f3f7bfdbdf941d9a83a852e1169ad9b0bcd1a572e50bd8f9712bb03ae2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-dtd-parser-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
