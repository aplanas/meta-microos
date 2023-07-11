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

RPM_NAME = "libtcnative-1-0-devel-1.2.23-2.15.aarch64.rpm"
RPM_HASH = "0dc7928f1e5e6df22e80d26afd19e74ee4062557fc7df168cffee65be602677efaa02e6efb73767fdfe02333fdabb86ffce454f46ff59e54a875be3746d96088"

RPROVIDES:${PN} += "libtcnative-1-0-devel \
pkgconfig-tcnative-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libapr1-devel \
libopenssl-devel \
libtcnative-1-0 \
pkgconfig-apr-1"

inherit rpm
