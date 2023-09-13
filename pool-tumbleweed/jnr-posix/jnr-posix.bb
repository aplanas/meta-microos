SUMMARY = "Java Posix layer"
DESCRIPTION = "jnr-posix is a lightweight cross-platform POSIX emulation layer for Java, \
written in Java and is part of the JNR project (http://github.com/jnr)."
LICENSE = "CPL-1.0 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "3.1.16"

RPM_NAME = "jnr-posix-3.1.16-3.1.noarch.rpm"
RPM_HASH = "63bf33d08e41cabe679286a108c7d368e8e1bd15b4e0a6992257002838fce570e42e89cf847853e4ee407294da49ebf59ba3e916241e8913c1c38d237a9b84c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-posix \
mvn-com.github.jnr-jnr-posix \
mvn-com.github.jnr-jnr-posix-pom- \
osgi-com.github.jnr.posix"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.github.jnr-jnr-constants \
mvn-com.github.jnr-jnr-ffi"

inherit rpm
