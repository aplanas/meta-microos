SUMMARY = "Javadoc for javamail"
DESCRIPTION = "Javadoc for javamail."
LICENSE = "CDDL-1.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "1.5.2"

RPM_NAME = "javamail-javadoc-1.5.2-7.4.noarch.rpm"
RPM_HASH = "c35bcbfe116f1a0c7881a6f91f0503ca6074f4d1a059746a51a2965fefca42a8629e3acb0c0ca6ae7b44a2207ba74681411bbf5c1868e35ec781068b4caebebd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javamail-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
