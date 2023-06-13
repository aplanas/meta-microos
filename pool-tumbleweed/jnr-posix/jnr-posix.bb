SUMMARY = "Java Posix layer"
DESCRIPTION = "jnr-posix is a lightweight cross-platform POSIX emulation layer for Java, \
written in Java and is part of the JNR project (http://github.com/jnr)."
LICENSE = "CPL-1.0 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "3.1.16"

RPM_NAME = "jnr-posix-3.1.16-2.1.noarch.rpm"
RPM_HASH = "33a5d2e5aa110deb8c31fbbd11f39e655a3bb288a12e834c8e8c2a60dc3ea94ba11901165db2a0c7c380a9fed4753f87b1214424b1c540c84f8bbb1342e6e800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-posix \
mvn(com.github.jnr:jnr-posix) \
mvn(com.github.jnr:jnr-posix:pom:) \
osgi(com.github.jnr.posix)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.github.jnr:jnr-constants) \
mvn(com.github.jnr:jnr-ffi)"

inherit rpm
