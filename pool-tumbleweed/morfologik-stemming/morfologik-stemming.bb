SUMMARY = "Morfologik stemming library"
DESCRIPTION = "Morfologik provides high quality lemmatisation for the Polish language, \
along with tools for building and using byte-based finite state automata."
LICENSE = "BSD-3-Clause"

PV = "2.1.9"

RPM_NAME = "morfologik-stemming-2.1.9-2.1.noarch.rpm"
RPM_HASH = "55880f121334e53edfdc42997fb6e2485d80cafebb0ddb70e48d0db98ff73df0abd27a59b5d740ebb5cbec710eda43d992c57c35e0b8313d34d588adbe01b28b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "morfologik-stemming \
mvn-org.carrot2-morfologik-fsa \
mvn-org.carrot2-morfologik-fsa-builders \
mvn-org.carrot2-morfologik-fsa-builders-pom- \
mvn-org.carrot2-morfologik-fsa-pom- \
mvn-org.carrot2-morfologik-parent-pom- \
mvn-org.carrot2-morfologik-polish \
mvn-org.carrot2-morfologik-polish-pom- \
mvn-org.carrot2-morfologik-speller \
mvn-org.carrot2-morfologik-speller-pom- \
mvn-org.carrot2-morfologik-stemming \
mvn-org.carrot2-morfologik-stemming-pom- \
mvn-org.carrot2-morfologik-tools \
mvn-org.carrot2-morfologik-tools-pom- \
osgi-org.carrot2.morfologik-fsa \
osgi-org.carrot2.morfologik-fsa-builders \
osgi-org.carrot2.morfologik-polish \
osgi-org.carrot2.morfologik-speller \
osgi-org.carrot2.morfologik-stemming"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.beust-jcommander \
mvn-com.carrotsearch-hppc"

inherit rpm
