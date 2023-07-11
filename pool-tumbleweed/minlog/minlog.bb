SUMMARY = "Minimal overhead Java logging"
DESCRIPTION = "MinLog is a Java logging library. Key features: \
 \
* Zero overhead Logging statements below a given level \
  can be automatically removed by javac at compile time. \
  This means applications can have detailed trace and \
  debug logging without having any impact on the finished product. \
 \
* Simple and efficient The API is concise and the code \
  is very efficient at run-time. \
 \
* Extremely lightweight The entire project consists of a single \
  Java file with ~100 non-comment lines of code."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "minlog-1.3.1-1.4.noarch.rpm"
RPM_HASH = "a699ef3a197313ff68d53aec5ddf6a1a238a5a9ae1edcfa4ff580d58a6e127919132e36dc5d8889407699468de662fad0d1a2076d59048d30173ab0c270f3fce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "minlog \
mvn-com.esotericsoftware-minlog \
mvn-com.esotericsoftware-minlog--tests- \
mvn-com.esotericsoftware-minlog-pom- \
mvn-com.esotericsoftware.minlog-minlog \
mvn-com.esotericsoftware.minlog-minlog--tests- \
mvn-com.esotericsoftware.minlog-minlog-pom- \
mvn-com.googlecode-minlog \
mvn-com.googlecode-minlog--tests- \
mvn-com.googlecode-minlog-pom- \
osgi-com.esotericsoftware.minlog"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
