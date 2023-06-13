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

RPM_NAME = "opennlp-1.5.3-3.10.noarch.rpm"
RPM_HASH = "7fdb796e88912aa11ede18df92416397567c3399ad7b735830be4b34f3a7b3cad5b6f7b716c19d5a4d53b6a7cfcca47f5736313b7dcb20da6b4d03cdf48ce33d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.apache.opennlp:opennlp:pom:) \
opennlp"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven.plugins:maven-compiler-plugin) \
mvn(org.apache:apache:pom:)"

inherit rpm
