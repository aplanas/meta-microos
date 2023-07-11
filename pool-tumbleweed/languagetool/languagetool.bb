SUMMARY = "Style and Grammar Checker for 25+ Languages"
DESCRIPTION = "LanguageTool is a free and open-source grammar checker."
LICENSE = "LGPL-2.1-or-later"

PV = "4.8"

RPM_NAME = "languagetool-4.8-3.2.aarch64.rpm"
RPM_HASH = "6e286bf1e56d39331b09a96eab30a4420e195a0de73be453bacd3366b6f752a1ec8f6122514000dd42e03441eaff410f8ef8dfae4a7342c279b0492b1367fd5e"

RPROVIDES:${PN} += "languagetool"

RDEPENDS:${PN} += "/usr/bin/sh \
akka \
apache-commons-cli \
apache-commons-codec \
apache-commons-collections4 \
apache-commons-csv \
apache-commons-io \
apache-commons-lang3 \
apache-commons-logging \
apache-commons-pool2 \
apache-commons-text \
bcel \
berkeleylm \
beust-jcommander \
catalan-pos-dict \
german-pos-dict \
glassfish-fastinfoset \
glassfish-jaxb-api \
glassfish-jaxb-runtime \
glassfish-jaxb-txw2 \
guava \
hamcrest-core \
hppc \
indriya \
istack-commons-runtime \
jackson-annotations \
jackson-core \
jackson-databind \
jaf \
jafama \
java-jwt \
jetbrains-annotations \
jna \
jsr-305 \
junit \
jwnl \
jwordsplitter \
kryo \
language-detector \
languagetool-core \
languagetool-core-tests \
languagetool-libs \
languagetool-tools \
logback \
lucene-backward-codecs \
lucene-core \
mariadb-java-client \
minlog \
morfologik-stemming \
mybatis \
objectweb-asm \
objenesis \
opennlp-chunk-models \
opennlp-maxent \
opennlp-postag-models \
opennlp-tokenize-models \
opennlp-tools \
openregex \
prometheus-simpleclient-java \
prometheus-simpleclient-java-common \
prometheus-simpleclient-java-guava \
prometheus-simpleclient-java-hotspot \
prometheus-simpleclient-java-httpserver \
reflectasm \
regexp \
scala \
segment \
slf4j \
stax-ex \
typesafe-config \
unit-api \
uom-lib-common \
xgboost \
xgboost-predictor"

inherit rpm
