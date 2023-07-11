SUMMARY = "An asynchronous event-driven network application framework and tools for Java"
DESCRIPTION = "Netty is a NIO client server framework which enables quick and easy \
development of network applications such as protocol servers and \
clients. It greatly simplifies and streamlines network programming \
such as TCP and UDP socket server. \
 \
'Quick and easy' doesn't mean that a resulting application will suffer \
from a maintainability or a performance issue. Netty has been designed \
carefully with the experiences earned from the implementation of a lot \
of protocols such as FTP, SMTP, HTTP, and various binary and \
text-based legacy protocols. As a result, Netty has succeeded to find \
a way to achieve ease of development, performance, stability, and \
flexibility without a compromise."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain"

PV = "3.10.6"

RPM_NAME = "netty3-3.10.6-14.11.noarch.rpm"
RPM_HASH = "00c17f683f78c1f2bb9d00182b3dfd9eacd817e1153be985453700bab50bc8fc9156e8d9ba529935963f369353b362f93180eee2a8e5ead0f4ff4f5f8c23066b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.netty-netty \
mvn-io.netty-netty-pom- \
mvn-org.jboss.netty-netty \
mvn-org.jboss.netty-netty-pom- \
netty3 \
osgi-org.jboss.netty"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.jcraft-jzlib \
mvn-org.bouncycastle-bcprov-jdk16"

inherit rpm
