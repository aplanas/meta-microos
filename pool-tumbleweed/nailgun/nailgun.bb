SUMMARY = "Framework for running Java from the cli without the JVM startup overhead"
DESCRIPTION = "Nailgun is a client, protocol, and server for running Java programs from the \
command line without incurring the JVM startup overhead. Programs run in the \
server (which is implemented in Java), and are triggered by the client \
(written in C), which handles all I/O."
LICENSE = "Apache-2.0"

PV = "0.9.1"

RPM_NAME = "nailgun-0.9.1-3.10.noarch.rpm"
RPM_HASH = "c7da2df43a355aad61ebbb03c7d227018cb632c3d5f85571498c50b377907d652ff5ba7037f04ae535ed9d463835897a5ddf75b6cea51787a1d1f0305cfb1bda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(com.martiansoftware:nailgun-all:pom:) \
mvn(com.martiansoftware:nailgun-examples) \
mvn(com.martiansoftware:nailgun-examples:pom:) \
mvn(com.martiansoftware:nailgun-server) \
mvn(com.martiansoftware:nailgun-server:pom:) \
nailgun"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
