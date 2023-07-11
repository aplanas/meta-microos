SUMMARY = "Style and Grammar Checker for 25+ Languages (libraries)"
DESCRIPTION = "LanguageTool is a free and open-source grammar checker. \
 \
This package contains the jar files built by languagetool \
project."
LICENSE = "LGPL-2.1-or-later"

PV = "4.8"

RPM_NAME = "languagetool-libs-4.8-3.2.noarch.rpm"
RPM_HASH = "5e68aee36b28173658a4849cf2368d7156faf0e9b8c42338cd36720a17b22a678410c72e7c07c3b43cb4713abc8d3a5b2e01c31ed49514ebcfe232570ecf1425"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "languagetool-libs \
mvn-org.languagetool-language-all \
mvn-org.languagetool-language-all-pom- \
mvn-org.languagetool-language-ast \
mvn-org.languagetool-language-ast-pom- \
mvn-org.languagetool-language-be \
mvn-org.languagetool-language-be-pom- \
mvn-org.languagetool-language-br \
mvn-org.languagetool-language-br-pom- \
mvn-org.languagetool-language-ca \
mvn-org.languagetool-language-ca-pom- \
mvn-org.languagetool-language-da \
mvn-org.languagetool-language-da-pom- \
mvn-org.languagetool-language-de \
mvn-org.languagetool-language-de-DE-x-simple-language \
mvn-org.languagetool-language-de-DE-x-simple-language-pom- \
mvn-org.languagetool-language-de-pom- \
mvn-org.languagetool-language-en \
mvn-org.languagetool-language-en-pom- \
mvn-org.languagetool-language-eo \
mvn-org.languagetool-language-eo-pom- \
mvn-org.languagetool-language-es \
mvn-org.languagetool-language-es-pom- \
mvn-org.languagetool-language-fa \
mvn-org.languagetool-language-fa-pom- \
mvn-org.languagetool-language-fr \
mvn-org.languagetool-language-fr-pom- \
mvn-org.languagetool-language-gl \
mvn-org.languagetool-language-gl-pom- \
mvn-org.languagetool-language-is \
mvn-org.languagetool-language-is-pom- \
mvn-org.languagetool-language-it \
mvn-org.languagetool-language-it-pom- \
mvn-org.languagetool-language-km \
mvn-org.languagetool-language-km-pom- \
mvn-org.languagetool-language-lt \
mvn-org.languagetool-language-lt-pom- \
mvn-org.languagetool-language-ml \
mvn-org.languagetool-language-ml-pom- \
mvn-org.languagetool-language-nl \
mvn-org.languagetool-language-nl-pom- \
mvn-org.languagetool-language-pl \
mvn-org.languagetool-language-pl-pom- \
mvn-org.languagetool-language-pt \
mvn-org.languagetool-language-pt-pom- \
mvn-org.languagetool-language-ro \
mvn-org.languagetool-language-ro-pom- \
mvn-org.languagetool-language-ru \
mvn-org.languagetool-language-ru-pom- \
mvn-org.languagetool-language-sk \
mvn-org.languagetool-language-sk-pom- \
mvn-org.languagetool-language-sl \
mvn-org.languagetool-language-sl-pom- \
mvn-org.languagetool-language-sv \
mvn-org.languagetool-language-sv-pom- \
mvn-org.languagetool-language-ta \
mvn-org.languagetool-language-ta-pom- \
mvn-org.languagetool-language-tl \
mvn-org.languagetool-language-tl-pom- \
mvn-org.languagetool-languagetool-commandline \
mvn-org.languagetool-languagetool-commandline-pom- \
mvn-org.languagetool-languagetool-gui-commons \
mvn-org.languagetool-languagetool-gui-commons-pom- \
mvn-org.languagetool-languagetool-http-client \
mvn-org.languagetool-languagetool-http-client-pom- \
mvn-org.languagetool-languagetool-server \
mvn-org.languagetool-languagetool-server-pom- \
mvn-org.languagetool-languagetool-standalone \
mvn-org.languagetool-languagetool-standalone-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-ch.qos.logback-logback-classic \
mvn-com.auth0-java-jwt \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-com.hankcs-aho-corasick-double-array-trie \
mvn-com.intellij-annotations \
mvn-commons-io-commons-io \
mvn-de.danielnaber-german-pos-dict \
mvn-de.danielnaber-jwordsplitter \
mvn-edu.washington.cs.knowitall-opennlp-chunk-models \
mvn-edu.washington.cs.knowitall-opennlp-postag-models \
mvn-edu.washington.cs.knowitall-opennlp-tokenize-models \
mvn-edu.washington.cs.knowitall-openregex \
mvn-io.prometheus-simpleclient \
mvn-io.prometheus-simpleclient-guava \
mvn-io.prometheus-simpleclient-hotspot \
mvn-io.prometheus-simpleclient-httpserver \
mvn-junit-junit \
mvn-org.apache.commons-commons-collections4 \
mvn-org.apache.opennlp-opennlp-tools \
mvn-org.languagetool-languagetool-core \
mvn-org.languagetool-languagetool-core--tests- \
mvn-org.languagetool-languagetool-tools \
mvn-org.mariadb.jdbc-mariadb-java-client \
mvn-org.mybatis-mybatis \
mvn-org.slf4j-slf4j-api \
mvn-org.softcatala-catalan-pos-dict"

inherit rpm
