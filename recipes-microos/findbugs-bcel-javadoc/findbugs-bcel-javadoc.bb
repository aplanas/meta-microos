SUMMARY = "Javadoc for findbugs-bcel"
DESCRIPTION = "Javadoc for findbugs-bcel package."
LICENSE = "Apache-2.0"

PV = "6.0~20140707svn1547656"

RPM_NAME = "findbugs-bcel-javadoc-6.0~20140707svn1547656-1.16.noarch.rpm"
RPM_HASH = "4aa8756e76c1e930f41183038788930db399abb95d8f4698158af92a0fe016ea948450ceca3461690d0e223dd25ed5cea6925e37afd707644a70ad5ab18f26d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "findbugs-bcel-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
