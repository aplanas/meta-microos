SUMMARY = "OpenNLP Chunker Models"
DESCRIPTION = "Stock OpenNLP chunker models trained on conll2000 shared task data."
LICENSE = "Apache-2.0"

PV = "1.5"

RPM_NAME = "opennlp-chunk-models-1.5-1.13.noarch.rpm"
RPM_HASH = "84ba0863b0c6e9acd737872b1792a44d1cebf17bff8429e1323bdf265b57963b0fdb14ce9b3f751c754eae1c9c8ed8aac146f729e10f62654fc228bf51349b6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-edu.washington.cs.knowitall-opennlp-chunk-models \
mvn-edu.washington.cs.knowitall-opennlp-chunk-models-pom- \
opennlp-chunk-models"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
