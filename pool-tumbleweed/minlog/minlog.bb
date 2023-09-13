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

RPM_NAME = "minlog-1.3.1-2.1.noarch.rpm"
RPM_HASH = "0ffac3226dfb6eac8205e4de4d6d6ba5d6b42b58b57313d6bb90d3d8faf87e921624d125fd7c09fbc74919979126a76a2fde0c124bd6d0e2cda1427868973bdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "minlog \
mvn-com.esotericsoftware-minlog \
mvn-com.esotericsoftware-minlog-pom- \
mvn-com.esotericsoftware.minlog-minlog \
mvn-com.esotericsoftware.minlog-minlog-pom- \
mvn-com.googlecode-minlog \
mvn-com.googlecode-minlog-pom- \
osgi-com.esotericsoftware.minlog"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
