SUMMARY = "Ant task for findbugs"
DESCRIPTION = "This package defines an ant task for findbugs for easy integration of findbugs \
into your ant-controlled project."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.1"

RPM_NAME = "ant-findbugs-3.0.1-2.21.noarch.rpm"
RPM_HASH = "47fc321b93e5f8d5b1f21c0b187bb8cf6107061d69ab44fb048bb3c7b42a4ddb68e99b7ff5d4f1aa914af6f1e192a27b7d042cb6ffbc9698228204b4e8350eef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-findbugs \
config-ant-findbugs \
findbugs-/etc/ant.d/findbugs \
mvn-com.google.code.findbugs-findbugs-ant \
mvn-com.google.code.findbugs-findbugs-ant-pom- \
mvn-net.sourceforge.findbugs-findbugs-ant \
mvn-net.sourceforge.findbugs-findbugs-ant-pom-"

RDEPENDS:${PN} += "ant \
findbugs \
java-headless \
javapackages-filesystem \
mvn-com.google.code.findbugs-findbugs"

inherit rpm
