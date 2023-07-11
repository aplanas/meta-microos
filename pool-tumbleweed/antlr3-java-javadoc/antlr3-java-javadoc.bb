SUMMARY = "API documentation for antlr3-java"
DESCRIPTION = "API documentation for antlr3-java."
LICENSE = "BSD-3-Clause"

PV = "3.5.3"

RPM_NAME = "antlr3-java-javadoc-3.5.3-2.4.noarch.rpm"
RPM_HASH = "b68e291b4379791e25964ef6193c6913a32cdb0c3120fd738fbb36b0f0a3426d531f86ab6c80c10896a2fb66eacd371e09df0ed012af0d220bc602db7f9fae12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr3-java-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
