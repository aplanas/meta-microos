SUMMARY = "Java library for format string checks"
DESCRIPTION = "This project is derived from Sun's implementation of java.util.Formatter. It \
is designed to allow compile time checks as to whether or not a use of format \
string will be erronous when executed at runtime. \
 \
This code is derived from the OpenJDK implementation, jdk1.7.0-b35. As such, \
it is licensed under the same license as OpenJDK, GPL v2 + the Classpath \
exception. \
 \
This project is preliminary, and the API is subject to change. The library \
produced by compiling this project is used by the FindBugs project. To avoid \
any licensing questions due to incompatible licenses (FindBugs is licensed \
under the LGPL), it is broken out as a separate project. While there may be \
some confusion/discussion about the licenses, the FindBugs project does not \
interpret the FindBugs LGPL license to be any stronger than GPL v2 + the \
Classpath exception."
LICENSE = "GPL-2.0-only"

PV = "0.10~20131207"

RPM_NAME = "jformatstring-0.10~20131207-3.6.noarch.rpm"
RPM_HASH = "90a7f42238075ed020ac06c6eccb369572e02737c00b6b215c47125c9397c13cb91a793af7a39e29253b862d4a7fb486ada3cce94c75321343dfd2bef6a0f37e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jFormatString \
jformatstring \
mvn(com.google.code.findbugs:jFormatString) \
mvn(com.google.code.findbugs:jFormatString:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
