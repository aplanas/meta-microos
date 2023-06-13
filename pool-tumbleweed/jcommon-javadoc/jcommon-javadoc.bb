SUMMARY = "Common library"
DESCRIPTION = "Collection of classes used by Object Refinery Projects, for example \
jfreechart"
LICENSE = "LGPL-2.1-only"

PV = "1.0.24"

RPM_NAME = "jcommon-javadoc-1.0.24-2.6.noarch.rpm"
RPM_HASH = "06d36811069716510770003999af94a75c5c09c3c0bb717538fbfd5162b33dee9bbdaace2ab4022a4785d104893a8cc8d2110cc40212d1b6d71a35db1e3a20a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcommon-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
