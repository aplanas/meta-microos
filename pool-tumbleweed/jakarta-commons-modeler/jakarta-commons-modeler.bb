SUMMARY = "Jakarta Commons Modeler Package"
DESCRIPTION = "The Modeler project creates and maintains a set of Java classes to \
provide a number of facilities for Model MBeans plus unit tests and \
small examples of using these facilities to instrument Java classes \
with Model MBean support."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "jakarta-commons-modeler-2.0.1-2.7.noarch.rpm"
RPM_HASH = "639ef2d027b437cca920824d7e1938d3c76f668e1367b5d4422e0def6df170aecba1fbacb55c8fed6d967d5a43dd0ea6529a38f22a207cc10154a04d0bef90ec"
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
