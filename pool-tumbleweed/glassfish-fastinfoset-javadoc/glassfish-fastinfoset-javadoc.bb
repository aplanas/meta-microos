SUMMARY = "Javadoc for glassfish-fastinfoset"
DESCRIPTION = "This package contains javadoc for glassfish-fastinfoset."
LICENSE = "Apache-2.0"

PV = "1.2.15"

RPM_NAME = "glassfish-fastinfoset-javadoc-1.2.15-4.5.noarch.rpm"
RPM_HASH = "1218a0e060e0b9401af1029a6051e4a0c68647dfab9100732bd7d03c08037931198bd8c84fb63412385d0615fce78e90891c11f07f9850782586a45fe6d7ceb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-fastinfoset-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
