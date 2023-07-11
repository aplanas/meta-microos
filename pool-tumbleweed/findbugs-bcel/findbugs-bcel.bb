SUMMARY = "Byte Code Engineering Library with findbugs extensions"
DESCRIPTION = "This is a version of Apache's Byte Code Engineering Library (BCEL) that has \
been modified by the findbugs developers.  The modifications add some new \
functionality, and also introduce a number of performance optimizations to \
address findbugs performance problems.  Some of the performance optimizations \
induce API changes, so this version of BCEL is not compatible with the vanilla \
upstream version."
LICENSE = "Apache-2.0"

PV = "6.0~20140707svn1547656"

RPM_NAME = "findbugs-bcel-6.0~20140707svn1547656-1.17.noarch.rpm"
RPM_HASH = "eaea8990b57114824140dd8ca95b7f8ccb4c705f933d3adef6b30a6be52a57e9764b9abf58674b8078aae3134c5c45547a9b32f97c25725b0ae8cb29987bed55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "findbugs-bcel \
mvn-com.google.code.findbugs-bcel \
mvn-com.google.code.findbugs-bcel-findbugs \
mvn-com.google.code.findbugs-bcel-findbugs-pom- \
mvn-com.google.code.findbugs-bcel-pom-"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm
