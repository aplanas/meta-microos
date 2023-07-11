SUMMARY = "Javadoc for jakarta-commons-modeler"
DESCRIPTION = "The Modeler project shall create and maintain a set of Java classes to \
provide the facilities described in the preceeding section, plus unit \
tests and small examples of using these facilities to instrument Java \
classes with Model MBean support. \
 \
This package contains the javadoc documentation for the Jakarta Commons \
Modeler Package."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "jakarta-commons-modeler-javadoc-2.0.1-2.7.noarch.rpm"
RPM_HASH = "8b164ebe3bdf3bb5a6f5b781c07d618168540ca74a1db6d6c5defe175483b5e6d9e1196fd9720b3346d38c3db6daf3e45ce772a680404de348264b70e6fc96f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-commons-modeler-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
