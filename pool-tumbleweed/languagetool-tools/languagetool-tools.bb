SUMMARY = "Style and Grammar Checker for 25+ Languages - Tools package"
DESCRIPTION = "LanguageTool is a free and open-source grammar checker. \
This package contains the tools for dictionary developers"
LICENSE = "LGPL-2.1-or-later"

PV = "4.8"

RPM_NAME = "languagetool-tools-4.8-3.2.noarch.rpm"
RPM_HASH = "abfa2f48b04dbcec14dae9c0c9bf15d43d35b9f38e86852f22d2531e2101835a29db7d7f1263369942ca4a55eaee563b6c93168bf02e19c9f26aaf0091dbd285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "languagetool-tools \
mvn-org.languagetool-languagetool-tools \
mvn-org.languagetool-languagetool-tools-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-cli-commons-cli \
mvn-org.carrot2-morfologik-tools \
mvn-org.languagetool-languagetool-core"

inherit rpm
