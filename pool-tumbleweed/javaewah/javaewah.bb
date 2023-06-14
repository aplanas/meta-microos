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

RPM_NAME = "javaewah-1.1.6-2.10.noarch.rpm"
RPM_HASH = "077a8bdb62adbffd2982557266ad01b212db81b57fc8d472b2fdb6c602df98e386a8e9ab02ea166a9b0d98ae8060d311dece89acb8f46e8641763b754fbd1a3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javaewah \
mvn-com.googlecode.javaewah-JavaEWAH \
mvn-com.googlecode.javaewah-JavaEWAH-pom- \
osgi-com.googlecode.javaewah.JavaEWAH"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
