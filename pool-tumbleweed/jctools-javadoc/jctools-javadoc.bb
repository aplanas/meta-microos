SUMMARY = "Javadoc for jctools"
DESCRIPTION = "This package contains javadoc for jctools."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "jctools-javadoc-3.3.0-3.1.noarch.rpm"
RPM_HASH = "bc9c697830a3969f072c4108ec8d8ff3b5e0cf48bb54e3aa10bc648ca323e78bcaf4f370c57546dd6322231d40f868d1f2326b36f201f58bf3418ca2a8ea91bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jctools-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
