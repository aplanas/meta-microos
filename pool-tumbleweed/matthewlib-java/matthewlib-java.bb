SUMMARY = "A few useful Java libraries"
DESCRIPTION = "A collection of Java libraries: - Unix Sockets Library This is a \
   collection of classes and native code to allow you to read and \
   write Unix sockets in Java. \
 \
- Debug Library This is a comprehensive logging and debugging \
   solution. \
 \
- CGI Library This is a collection of classes and native code to \
   allow you to write CGI applications in Java. \
 \
- I/O Library This provides a few much needed extensions to the Java \
   I/O subsystem. \
 \
- Hexdump This class formats byte-arrays in hex and ascii for display."
LICENSE = "MIT"

PV = "0.8"

RPM_NAME = "matthewlib-java-0.8-13.7.aarch64.rpm"
RPM_HASH = "bb3938ce8d696f7c21eb797d09f963707efd4ada06e19a7e1d73c65342af36c337f56d8e9ff9317d9d662e05fd4df6f20d8c737b13e9d7184b867cddf06c578c"

RPROVIDES:${PN} += "libcgi-java.so \
libmatthew-java \
libunix-java.so \
matthewlib-java"

RDEPENDS:${PN} += "/sbin/ldconfig \
java \
javapackages-tools \
libc.so.6"

inherit rpm
