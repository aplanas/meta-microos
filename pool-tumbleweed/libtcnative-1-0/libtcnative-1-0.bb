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

RPM_NAME = "libtcnative-1-0-1.2.23-2.15.aarch64.rpm"
RPM_HASH = "38bd0dc57598572eddc57cd24f7ca8fb31b56703358183b268e965a12c5dfbfe7397b4e4ea2523c95e94dfa09a0045c5e6228cd3b5ec0764ad71cd85a901db0b"

RPROVIDES:${PN} += "libtcnative-1-0 \
libtcnative-1.so.0 \
tcnative \
tomcat-native"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
