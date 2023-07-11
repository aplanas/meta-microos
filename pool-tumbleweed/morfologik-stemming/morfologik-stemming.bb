SUMMARY = "Morfologik stemming library"
DESCRIPTION = "Morfologik provides high quality lemmatisation for the Polish language, \
along with tools for building and using byte-based finite state automata."
LICENSE = "BSD-3-Clause"

PV = "2.1.9"

RPM_NAME = "morfologik-stemming-2.1.9-1.2.noarch.rpm"
RPM_HASH = "6e1bdcc8e96964718661defb15b9dc1827cac76a8feaa946eed4b1c96e69e79e41e1830e4e01200d645d5946d2303c7ee4c3666dd208b68e77945a7681b1bed9"
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
