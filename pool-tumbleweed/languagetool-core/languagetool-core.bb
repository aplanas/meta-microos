SUMMARY = "Style and Grammar Checker for 25+ Languages - Core package"
DESCRIPTION = "LanguageTool is a free and open-source grammar checker. \
This package contains the core library"
LICENSE = "LGPL-2.1-or-later"

PV = "4.8"

RPM_NAME = "languagetool-core-4.8-3.1.noarch.rpm"
RPM_HASH = "18fafb22b3b37b2e56342da9d0dab4130cd7eafc43971db1f46843bb16f2e13354804eed0480c4d05d56c11c9ea30c3f7ffcf30737d0c137e30f7d9096a922e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "languagetool-core \
mvn-org.languagetool-languagetool-core \
mvn-org.languagetool-languagetool-core-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
libhunspell-1-7-0 \
lucene-backward-codecs \
lucene-core \
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
