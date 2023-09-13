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

RPM_NAME = "javaewah-1.1.6-3.1.noarch.rpm"
RPM_HASH = "14f99750074b3f536b995f1bd411834c572f679a87bd4fd963abe439e5353151c6f2c897d3f3fc108d8ec71d9aa47fbec3427ba1b81f686cefb9df95457a69af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javaewah \
mvn-com.googlecode.javaewah-JavaEWAH \
mvn-com.googlecode.javaewah-JavaEWAH-pom- \
osgi-com.googlecode.javaewah.JavaEWAH"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
