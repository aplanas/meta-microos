SUMMARY = "German part-of-speech dictionary"
DESCRIPTION = "A Catalan part-of-speech (POS) dictionary as a Morfologik binary"
LICENSE = "GPL-2.0-only | LGPL-2.1-only"

PV = "2.7+git6dc3553"

RPM_NAME = "catalan-pos-dict-2.7+git6dc3553-1.21.noarch.rpm"
RPM_HASH = "de99c32d123dfc6eef650368c6a665e22f1662a91d075b141b9deec6a004bdb97f546be64de0f1215d93d80ab232d1d72b3b0662f7b775ad12be286329d1a21f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "catalan-pos-dict \
mvn(org.softcatala:catalan-pos-dict) \
mvn(org.softcatala:catalan-pos-dict:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.carrot2:morfologik-fsa) \
mvn(org.carrot2:morfologik-stemming)"

inherit rpm
