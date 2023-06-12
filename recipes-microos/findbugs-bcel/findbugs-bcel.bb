SUMMARY = "Byte Code Engineering Library with findbugs extensions"
DESCRIPTION = "This is a version of Apache's Byte Code Engineering Library (BCEL) that has \
been modified by the findbugs developers.  The modifications add some new \
functionality, and also introduce a number of performance optimizations to \
address findbugs performance problems.  Some of the performance optimizations \
induce API changes, so this version of BCEL is not compatible with the vanilla \
upstream version."
LICENSE = "Apache-2.0"

PV = "6.0~20140707svn1547656"

RPM_NAME = "findbugs-bcel-6.0~20140707svn1547656-1.16.noarch.rpm"
RPM_HASH = "4d7b7d434c500902cd4b491aa3746300b938d8dd084563db42fafdfa94f0038e30368789ebd9afed46fd3071ebff855dfb890c528f44891c9ecac9ae7b7e16a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "findbugs-bcel \
mvn(com.google.code.findbugs:bcel) \
mvn(com.google.code.findbugs:bcel-findbugs) \
mvn(com.google.code.findbugs:bcel-findbugs:pom:) \
mvn(com.google.code.findbugs:bcel:pom:)"
RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm
