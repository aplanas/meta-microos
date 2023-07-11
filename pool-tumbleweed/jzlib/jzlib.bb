SUMMARY = "Re-implementation of zlib in pure Java"
DESCRIPTION = "The zlib is designed to be a free, general-purpose, legally \
unencumbered -- that is, not covered by any patents -- lossless \
data-compression library for use on virtually any computer hardware and \
operating system. The zlib was written by Jean-loup Gailly \
(compression) and Mark Adler (decompression)."
LICENSE = "BSD-3-Clause"

PV = "1.1.3"

RPM_NAME = "jzlib-1.1.3-5.7.noarch.rpm"
RPM_HASH = "57264792245e77b6eda2acbcf99f0946c3b592eaf1dd9202180c0a9a275c1650bed759edaa7a04951de87063a3aa0dc0d1bde49c8aa7d4317543aefeacd31242"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jzlib \
mvn-com.jcraft-jzlib \
mvn-com.jcraft-jzlib-pom- \
osgi-com.jcraft.jzlib"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
