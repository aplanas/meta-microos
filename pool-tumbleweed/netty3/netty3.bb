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

RPM_NAME = "netty3-3.10.6-14.10.noarch.rpm"
RPM_HASH = "625041a9b9f6c814e2b22dffd345ded02da70c207e831e5b8990bd5451341737e0faff5cac393d5e73305cd5006cff2aa88efe80208ee00a8253478341a29460"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(io.netty:netty) \
mvn(io.netty:netty:pom:) \
mvn(org.jboss.netty:netty) \
mvn(org.jboss.netty:netty:pom:) \
netty3 \
osgi(org.jboss.netty)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.jcraft:jzlib) \
mvn(org.bouncycastle:bcprov-jdk16)"

inherit rpm
