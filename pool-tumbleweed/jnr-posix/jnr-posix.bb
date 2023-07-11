SUMMARY = "Java Posix layer"
DESCRIPTION = "jnr-posix is a lightweight cross-platform POSIX emulation layer for Java, \
written in Java and is part of the JNR project (http://github.com/jnr)."
LICENSE = "CPL-1.0 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "3.1.16"

RPM_NAME = "jnr-posix-3.1.16-2.2.noarch.rpm"
RPM_HASH = "fa34d517d20334ab17e445bd624d944dae01f0632499ca22d50e14918a7f5cde0a15f514b8a61a6d85778706101f259426dda2799cfd7c9fddc8326339df9bdd"
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
