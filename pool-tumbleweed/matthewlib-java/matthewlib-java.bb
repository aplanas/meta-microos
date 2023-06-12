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

RPM_NAME = "matthewlib-java-0.8-13.6.aarch64.rpm"
RPM_HASH = "b216c319ec1505df49882fdcfc0e3cd7b18b62a3c68a6176dc0be42a8b34cc6cb5ba00ebf7188dbf4b0036dd9eada90b631bb8cdfecfcede390437ced46c6382"

RPROVIDES:${PN} += "libcgi-java.so()(64bit) \
libmatthew-java \
libunix-java.so()(64bit) \
matthewlib-java \
matthewlib-java(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
java \
javapackages-tools \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
