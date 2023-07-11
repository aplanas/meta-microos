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

RPM_NAME = "matthewlib-java-javadoc-0.8-13.7.aarch64.rpm"
RPM_HASH = "e60e1e110f0cc8b8b8b6d4aaf229caeff19c1f5495902b77eb30c4880c2cfb83c000264d2410c95608f67cf555d764b5a2e06c1a987d282d7f7d78fe6ce65124"

RPROVIDES:${PN} += "matthewlib-java-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
