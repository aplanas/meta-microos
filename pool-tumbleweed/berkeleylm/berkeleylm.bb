SUMMARY = "Berkeley Language Model library"
DESCRIPTION = "Berkeleylm is a library for estimating storing large n-gram language models in \
memory and accessing them efficiently. It is described in \
http://nlp.cs.berkeley.edu/pubs/Pauls-Klein_2011_LM_paper.pdf"
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "berkeleylm-1.1.6-2.7.noarch.rpm"
RPM_HASH = "8eabbca148334b0569df3cfba3944f3a3d1c69e62c3bc67a8088093b160f8cba1bd594021f15aac214aba36929cb9661c3d2ff2fdded992e855d65c1e3010548"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "berkeleylm \
mvn-edu.berkeley.nlp-berkeleylm \
mvn-edu.berkeley.nlp-berkeleylm-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
