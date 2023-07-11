SUMMARY = "German part-of-speech dictionary"
DESCRIPTION = "A Catalan part-of-speech (POS) dictionary as a Morfologik binary"
LICENSE = "GPL-2.0-only | LGPL-2.1-only"

PV = "2.7+git6dc3553"

RPM_NAME = "catalan-pos-dict-2.7+git6dc3553-1.22.noarch.rpm"
RPM_HASH = "383b02b6852d6222c2fb210a6d384cbc239b1b92d95fb81308144315cad87e2a7ed4909ac8a74fa83d17a030a0c0ec287b1e28c143ca1d9af89398f0631f1578"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "catalan-pos-dict \
mvn-org.softcatala-catalan-pos-dict \
mvn-org.softcatala-catalan-pos-dict-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.carrot2-morfologik-fsa \
mvn-org.carrot2-morfologik-stemming"

inherit rpm
