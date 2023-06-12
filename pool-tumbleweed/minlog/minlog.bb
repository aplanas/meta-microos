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

RPM_NAME = "minlog-1.3.1-1.3.noarch.rpm"
RPM_HASH = "674ad3247a58ace8c4756d7c69ef265f56ba77556b6bfb007e6e1b0c87fdf359d21df8ff0dca732d77115c9f207f983c277cfa2a21d75258bec4a77e140d219d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "minlog \
mvn(com.esotericsoftware.minlog:minlog) \
mvn(com.esotericsoftware.minlog:minlog::tests:) \
mvn(com.esotericsoftware.minlog:minlog:pom:) \
mvn(com.esotericsoftware:minlog) \
mvn(com.esotericsoftware:minlog::tests:) \
mvn(com.esotericsoftware:minlog:pom:) \
mvn(com.googlecode:minlog) \
mvn(com.googlecode:minlog::tests:) \
mvn(com.googlecode:minlog:pom:) \
osgi(com.esotericsoftware.minlog)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
