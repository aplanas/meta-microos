SUMMARY = "API documentation for antlr4"
DESCRIPTION = "This package contains API documentation for antlr4."
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "antlr4-javadoc-4.13.0-2.1.noarch.rpm"
RPM_HASH = "0b65d48204557318d2010ffe75b8f1cf9a114e028e7dc6dea3f6f945e3a014ca6f4ab5de51d5f24bc163392ffa5c312125e958be83acc256110a3dc0197b5d4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr4-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
