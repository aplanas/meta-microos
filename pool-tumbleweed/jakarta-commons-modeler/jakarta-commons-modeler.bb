SUMMARY = "Jakarta Commons Modeler Package"
DESCRIPTION = "The Modeler project creates and maintains a set of Java classes to \
provide a number of facilities for Model MBeans plus unit tests and \
small examples of using these facilities to instrument Java classes \
with Model MBean support."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "jakarta-commons-modeler-2.0.1-2.6.noarch.rpm"
RPM_HASH = "6154898be183e2c821160fac5e703f1858b7a2d742a374bb31c34a78b5b0e83cf446ebadb8ea60f5554020b1cd065a1f0d72b1e61f99f40651c1d2bbae707f9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "commons-modeler \
jakarta-commons-modeler"

RDEPENDS:${PN} += "jakarta-commons-beanutils \
jakarta-commons-collections \
jakarta-commons-digester \
jakarta-commons-logging \
jaxp-parser-impl \
jaxp-transform-impl \
mx4j \
xml-commons-apis"

inherit rpm
