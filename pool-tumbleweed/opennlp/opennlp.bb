SUMMARY = "A machine learning based toolkit for the processing of natural language text"
DESCRIPTION = "The Apache OpenNLP library is a machine learning based toolkit for the \
processing of natural language text. \
 \
It supports the most common NLP tasks, such as tokenization, sentence \
segmentation, part-of-speech tagging, named entity extraction, chunking, \
parsing, and coreference resolution. These tasks are usually required to \
build more advanced text processing services. OpenNLP also includes \
maximum entropy and perceptron based machine learning."
LICENSE = "Apache-2.0"

PV = "1.5.3"

RPM_NAME = "opennlp-1.5.3-3.11.noarch.rpm"
RPM_HASH = "5e9d0ccba4e40f2b874501873db63d65373a9a6dc5c679e98ced787e867c27f8c7eaaaa6ce4ac4d341734331d93295ab91da8e33a6cedb75039da296dddd6da6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.opennlp-opennlp-pom- \
opennlp"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache-apache-pom- \
mvn-org.apache.maven.plugins-maven-compiler-plugin"

inherit rpm
