SUMMARY = "Pure Java implementation of SSH2"
DESCRIPTION = "JSch allows you to connect to an sshd server and use port forwarding, \
X11 forwarding, file transfer, etc., and you can integrate its \
functionality into your own Java programs."
LICENSE = "BSD-3-Clause"

PV = "0.2.9"

RPM_NAME = "jsch-0.2.9-1.2.noarch.rpm"
RPM_HASH = "e0856f410ea1fe7314a284b282a49ec9033495aa832e2159db5de66785b8301dc18ff13d571ce3dbf46967971f2deaf4a4a7c8b3373a5f3da50fa99408616d1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsch \
mvn-com.github.mwiede-jsch \
mvn-com.github.mwiede-jsch-pom- \
mvn-com.jcraft-jsch \
mvn-com.jcraft-jsch-pom- \
osgi-com.jcraft.jsch"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem"

inherit rpm
