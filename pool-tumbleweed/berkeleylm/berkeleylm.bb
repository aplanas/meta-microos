SUMMARY = "Berkeley Language Model library"
DESCRIPTION = "Berkeleylm is a library for estimating storing large n-gram language models in \
memory and accessing them efficiently. It is described in \
http://nlp.cs.berkeley.edu/pubs/Pauls-Klein_2011_LM_paper.pdf"
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "berkeleylm-1.1.6-2.6.noarch.rpm"
RPM_HASH = "85f107a91dc2bef8833e3103c5f9d48d1d3953237266c34a1cd94b1418f57c16f74bd0b7cc4fd4b1ab9850cbdb918a78934a3f18f4de35cee2c2d5286360abd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "berkeleylm \
mvn-edu.berkeley.nlp-berkeleylm \
mvn-edu.berkeley.nlp-berkeleylm-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
