SUMMARY = "Style and Grammar Checker for 25+ Languages - Core package"
DESCRIPTION = "LanguageTool is a free and open-source grammar checker. \
This package contains the test-jar for core library"
LICENSE = "LGPL-2.1-or-later"

PV = "4.8"

RPM_NAME = "languagetool-core-tests-4.8-3.2.noarch.rpm"
RPM_HASH = "d14d002d05af78bbc730773cc2aa0debd03c0c269df35f6b6433fafd0b2e3fca604d81c54137fea9c0a02f6405832ccbb12b22cffdac117e3237eb43fc5adf17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "languagetool-core-tests \
mvn-org.languagetool-languagetool-core--tests-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-ai.h2o-xgboost-predictor \
mvn-com.carrotsearch-hppc \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-com.google.guava-guava \
mvn-com.intellij-annotations \
mvn-com.optimaize.languagedetector-language-detector \
mvn-javax.activation-javax.activation-api \
mvn-javax.measure-unit-api \
mvn-javax.xml.bind-jaxb-api \
mvn-ml.dmlc-xgboost4j \
mvn-net.java.dev.jna-jna \
mvn-net.loomchild-segment \
mvn-org.apache.commons-commons-csv \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.commons-commons-pool2 \
mvn-org.apache.commons-commons-text \
mvn-org.apache.lucene-lucene-backward-codecs \
mvn-org.apache.lucene-lucene-core \
mvn-org.carrot2-morfologik-fsa \
mvn-org.carrot2-morfologik-fsa-builders \
mvn-org.carrot2-morfologik-speller \
mvn-org.carrot2-morfologik-stemming \
mvn-org.glassfish.jaxb-jaxb-runtime \
mvn-org.slf4j-slf4j-api \
mvn-tech.units-indriya"

inherit rpm
