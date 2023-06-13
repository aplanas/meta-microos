SUMMARY = "JNI wrappers for Apache Portable Runtime for Tomcat"
DESCRIPTION = "Tomcat can use the Apache Portable Runtime to provide superior \
scalability, performance, and better integration with native server \
technologies. The Apache Portable Runtime is a highly portable library \
that is at the heart of Apache HTTP Server 2.x. APR has many uses, \
including access to advanced IO functionality (such as sendfile, epoll \
and OpenSSL), OS level functionality (random number generation, system \
status, etc), and native process handling (shared memory, NT pipes and \
Unix sockets). \
 \
These features allows making Tomcat a general purpose webserver, will \
enable much better integration with other native web technologies, and \
overall make Java much more viable as a full fledged webserver platform \
rather than simply a backend focused technology."
LICENSE = "Apache-2.0"

PV = "1.2.23"

RPM_NAME = "libtcnative-1-0-devel-1.2.23-2.14.aarch64.rpm"
RPM_HASH = "c58aac52b26b124b286a8037930c4716f7217460da120431ae3217e16b0fa1912ea2c87eb37dea452e3eda88f2fffb6331cc43b45954d5bfbe550c45dee661e4"

RPROVIDES:${PN} += "libtcnative-1-0-devel \
libtcnative-1-0-devel(aarch-64) \
pkgconfig(tcnative-1)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libapr1-devel \
libopenssl-devel \
libtcnative-1-0 \
pkgconfig(apr-1)"

inherit rpm
