SUMMARY = "API documentation for antlr4"
DESCRIPTION = "This package contains API documentation for antlr4."
LICENSE = "BSD-3-Clause"

PV = "4.9.3"

RPM_NAME = "antlr4-javadoc-4.9.3-1.10.noarch.rpm"
RPM_HASH = "a350e1a3c480c1e691483417a79ccf6b85a3bf51d84cce86847421191381796ed9dcb6c4a4340928bedecdb0b87ef21dc7322b9f68906754eee75995d341fbff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr4-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
