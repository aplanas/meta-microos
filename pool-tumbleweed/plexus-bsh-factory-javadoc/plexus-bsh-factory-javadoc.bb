SUMMARY = "Javadoc for plexus-bsh-factory"
DESCRIPTION = "Javadoc for plexus-bsh-factory."
LICENSE = "MIT"

PV = "1.0~a7"

RPM_NAME = "plexus-bsh-factory-javadoc-1.0~a7-2.7.noarch.rpm"
RPM_HASH = "a30646edec728337fa218bef265385640c5a1bb632c0235ec016e054d938f66088156477d23315cd96685df75f80abfc34511ab8f093257cebae2f7427918990"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-bsh-factory-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
