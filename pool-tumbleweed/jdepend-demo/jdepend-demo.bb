SUMMARY = "Demonstration and sample files for jdepend"
DESCRIPTION = "JDepend traverses a set of Java class and source file directories and \
generates design quality metrics for each Java package. JDepend allows \
you to automatically measure the quality of a design in terms of its \
extensibility, reusability, and maintainability to effectively manage \
and control package dependencies. \
 \
This package contains demonstration and sample files for JDepend."
LICENSE = "MIT"

PV = "2.10"

RPM_NAME = "jdepend-demo-2.10-3.3.noarch.rpm"
RPM_HASH = "bdc555af587ae24f5056830c36f56e890b2b8d77b005e7581df73965a0db1b0b99986f4941ce5d5afa4cdb1bb45315ede2b3efd2166a282bad07c6e12eadbff0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdepend-demo"
RDEPENDS:${PN} += "jdepend"

inherit rpm
