SUMMARY = "OpenNLP Tokenizer Models"
DESCRIPTION = "Stock OpenNLP tokenizer models trained on opennlp training data."
LICENSE = "Apache-2.0"

PV = "1.5"

RPM_NAME = "opennlp-tokenize-models-1.5-1.13.noarch.rpm"
RPM_HASH = "81975252e761ea81c189a33218069308c336714489010bb8f1be44b137cda1691bd61eb4a0e975238a9d645af00bd4ef27c8b3f3f3801a26d2d592d82b0c4289"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-edu.washington.cs.knowitall-opennlp-tokenize-models \
mvn-edu.washington.cs.knowitall-opennlp-tokenize-models-pom- \
opennlp-tokenize-models"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
