SUMMARY = "German part-of-speech dictionary"
DESCRIPTION = "A German part-of-speech (POS) dictionary as a Morfologik binary"
LICENSE = "CC-BY-SA-4.0"

PV = "1.1"

RPM_NAME = "german-pos-dict-1.1-1.19.noarch.rpm"
RPM_HASH = "9d353bc1aa0e3c74bad43a78a6d6c4734b2267a5372ed167eca6999f2ab36df1ff5439122ee0f25a7b4c482f80e47fe2ec340ad4f0b9b2414863987f2aae53f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "german-pos-dict \
mvn-de.danielnaber-german-pos-dict \
mvn-de.danielnaber-german-pos-dict-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.carrot2-morfologik-fsa \
mvn-org.carrot2-morfologik-stemming"

inherit rpm
