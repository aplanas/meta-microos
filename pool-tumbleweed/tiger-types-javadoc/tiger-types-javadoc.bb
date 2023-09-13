SUMMARY = "Javadoc for tiger-types"
DESCRIPTION = "This package contains javadoc for tiger-types."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.2"

RPM_NAME = "tiger-types-javadoc-2.2-5.1.noarch.rpm"
RPM_HASH = "8f362c0e405027f618b049319e4c973eccdd954c582a27b4488f98d211b73603980d1c7046a369c17466520c276889723fd23799ccbe5e7531e9d6d0fef13158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tiger-types-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
