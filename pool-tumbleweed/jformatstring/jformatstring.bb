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

RPM_NAME = "jformatstring-0.10~20131207-3.7.noarch.rpm"
RPM_HASH = "ec19fdbe84b7fbf92f175d7f777398cfa62d01844081193eee992a1227bbfc7786a66efc6ae677e02e2edbc7555a0dc4a9f17d1b6052cc97b77bb7f93174889c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jFormatString \
jformatstring \
mvn-com.google.code.findbugs-jFormatString \
mvn-com.google.code.findbugs-jFormatString-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
