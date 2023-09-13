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

RPM_NAME = "opennlp-1.5.3-4.1.noarch.rpm"
RPM_HASH = "d2a7e96b4087393ef9a00fb54774176f5f641c5c5dd9e0b8f2636fcd1368636a6242d13d5d913e68c29a6ec94d035e69b9d554e0ba9b9a1cd97212d56129f774"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.opennlp-opennlp-pom- \
opennlp"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache-apache-pom- \
mvn-org.apache.maven.plugins-maven-compiler-plugin"

inherit rpm
