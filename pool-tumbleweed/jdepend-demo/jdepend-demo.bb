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

RPM_NAME = "jdepend-demo-2.10-3.4.noarch.rpm"
RPM_HASH = "c9b021bf5ce9b61d7192ef4c09c40016e0d86a3099ebf9fa5a80bd5bdffafce1a4203d9dfa4d3ca8a4ef621ae633425ac8fa59005ca9738c0cf12c8a26a024d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdepend-demo"

RDEPENDS:${PN} += "jdepend"

inherit rpm
