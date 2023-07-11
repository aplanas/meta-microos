SUMMARY = "Javadoc for glassfish-el"
DESCRIPTION = "This package contains javadoc for glassfish-el."
LICENSE = "(CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0) & Apache-2.0"

PV = "3.0.1~b08"

RPM_NAME = "glassfish-el-javadoc-3.0.1~b08-1.19.noarch.rpm"
RPM_HASH = "30532af9f47f2470a21d91553f2d3348d67b8a593f10ce1039edef48ad062f21f175acd0761cde9c19175783c875ef3ee549b089510c1827b831f06c888cf4b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-el-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
