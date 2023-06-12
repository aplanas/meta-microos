SUMMARY = "Java chart library"
DESCRIPTION = "JFreeChart is a free 100% Java chart library that makes it easy for \
developers to display professional quality charts in their applications."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.19"

RPM_NAME = "jfreechart-1.0.19-1.18.noarch.rpm"
RPM_HASH = "9438bb6000e850a6ead31326a54f0644dc52e16e12eb2568a68c4510a0749bc80e1054a581aa46d3a24c2aebd32716a345f03502e4efadeaaa0362fa7ac80310"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jfreechart \
mvn(org.jfree:jfreechart) \
mvn(org.jfree:jfreechart:pom:) \
osgi(org.jfree.jfreechart)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.jfree:jcommon)"

inherit rpm
