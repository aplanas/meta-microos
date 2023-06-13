SUMMARY = "Javadoc for xml-commons-resolver"
DESCRIPTION = "Javadoc for xml-commons-resolver."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "xml-commons-resolver-javadoc-1.2-4.6.noarch.rpm"
RPM_HASH = "d67701eded7d06b2bebb818ffa9f4efe5ed9f5ee228182455a6fde0dd5f0d50f44766678707ec9d89fe0c06b3e88bd65904891cf0945ebfc9e75ad81125f83bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xml-commons-resolver-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
