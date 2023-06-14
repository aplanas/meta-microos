SUMMARY = "German part-of-speech dictionary"
DESCRIPTION = "A German part-of-speech (POS) dictionary as a Morfologik binary"
LICENSE = "CC-BY-SA-4.0"

PV = "1.1"

RPM_NAME = "german-pos-dict-1.1-1.18.noarch.rpm"
RPM_HASH = "965291a4241cd2aad8a267a357acc413dd2b534fb963d9c45d585e339aa670b3c40c770921cb42844d8117aff2959933a145afaa724bc4b0736a4899e4c2e6bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "german-pos-dict \
mvn-de.danielnaber-german-pos-dict \
mvn-de.danielnaber-german-pos-dict-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.carrot2-morfologik-fsa \
mvn-org.carrot2-morfologik-stemming"

inherit rpm
