SUMMARY = "Ant task for findbugs"
DESCRIPTION = "This package defines an ant task for findbugs for easy integration of findbugs \
into your ant-controlled project."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.1"

RPM_NAME = "ant-findbugs-3.0.1-2.20.noarch.rpm"
RPM_HASH = "e0b595bb9748d79b5bc165ae94f14697e635c9fb4a98c2b312d66c6e8edeabb20a7791449db3500a226c9215500264a6f7a261f67bea04a5a4b2ed56c68ec9a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-findbugs \
config(ant-findbugs) \
findbugs:/etc/ant.d/findbugs \
mvn(com.google.code.findbugs:findbugs-ant) \
mvn(com.google.code.findbugs:findbugs-ant:pom:) \
mvn(net.sourceforge.findbugs:findbugs-ant) \
mvn(net.sourceforge.findbugs:findbugs-ant:pom:)"

RDEPENDS:${PN} += "ant \
findbugs \
java-headless \
javapackages-filesystem \
mvn(com.google.code.findbugs:findbugs)"

inherit rpm
