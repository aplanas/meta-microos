SUMMARY = "A word-aligned compressed variant of the Java bitset class"
DESCRIPTION = "JavaEWAH is a word-aligned compressed variant of the Java bitset class. \
It uses a 64-bit run-length encoding (RLE) compression scheme. \
 \
The goal of word-aligned compression is not to achieve the best \
compression, but rather to improve query processing time. Hence, we try \
to save CPU cycles, maybe at the expense of storage. However, the EWAH \
scheme we implemented is always more efficient storage-wise than an \
uncompressed bitmap (implemented in Java as the BitSet class). Unlike \
some alternatives, javaewah does not rely on a patented scheme."
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "javaewah-1.1.6-2.11.noarch.rpm"
RPM_HASH = "d3c308541418028415c5ae79e4bd106ab1b8d4e1823a682df79dd7ac768aea7641ce19e14aa284b3f9354774d3e62bbbfc70d3804dbc231266560d3a0cf2904e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javaewah \
mvn-com.googlecode.javaewah-JavaEWAH \
mvn-com.googlecode.javaewah-JavaEWAH-pom- \
osgi-com.googlecode.javaewah.JavaEWAH"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
