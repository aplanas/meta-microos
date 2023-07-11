SUMMARY = "OpenNLP Postag Models"
DESCRIPTION = "Stock OpenNLP postag models. Maxent model with tag dictionary."
LICENSE = "Apache-2.0"

PV = "1.5"

RPM_NAME = "opennlp-postag-models-1.5-1.13.noarch.rpm"
RPM_HASH = "803dc763890365606a432105a8fbe3a51e4b5195969670e99a74ef6a93d4aec5492420d4c0841655ff774a43e931528d644e525c231d712a97ba4097d1bb162b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-edu.washington.cs.knowitall-opennlp-postag-models \
mvn-edu.washington.cs.knowitall-opennlp-postag-models-pom- \
opennlp-postag-models"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
