SUMMARY = "Javadoc for jsr-311"
DESCRIPTION = "This package contains javadoc for jsr-311."
LICENSE = "CDDL-1.0"

PV = "1.1.1"

RPM_NAME = "jsr-311-javadoc-1.1.1-3.11.noarch.rpm"
RPM_HASH = "d99b459f9f31c0d5215ecfd6b5046f5c369e2a79c8234fc24bcdd629f7be661d77442b6251e04b5375cd81cbb27f30f5e4026a5988aa36ce73b62539c924a9dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsr-311-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
