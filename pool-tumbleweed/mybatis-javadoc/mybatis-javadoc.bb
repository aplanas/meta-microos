SUMMARY = "Javadoc for mybatis"
DESCRIPTION = "This package contains javadoc for mybatis."
LICENSE = "Apache-2.0"

PV = "3.5.6"

RPM_NAME = "mybatis-javadoc-3.5.6-7.1.noarch.rpm"
RPM_HASH = "cb951ccc2d04a08ec743d7fb1b5e3d663e8a4698d97b7bda939d3760a51952ae57b9b1af953c459521c42e8766bcb189fb6498d7a0d28d08a6fc15699b3504f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mybatis-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
