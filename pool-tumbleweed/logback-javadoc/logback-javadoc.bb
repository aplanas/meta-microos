SUMMARY = "Javadoc for logback"
DESCRIPTION = "API documentation for the Logback library"
LICENSE = "EPL-1.0 | LGPL-2.1-or-later"

PV = "1.2.11"

RPM_NAME = "logback-javadoc-1.2.11-1.10.noarch.rpm"
RPM_HASH = "29e698594aed00160279b1a2fe990e43f103b2fe88869fd4be5bd60ecb7e36c6eb2ab59d641708f2d14d053422e6c8e4a2b5e9da7626ad48a6ee3b6412648410"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "logback-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
