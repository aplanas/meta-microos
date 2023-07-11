SUMMARY = "Java class file shrinker, optimizer, obfuscator and preverifier"
DESCRIPTION = "ProGuard is a free Java class file shrinker, optimizer, obfuscator and \
preverifier. It detects and removes unused classes, fields, methods, and \
attributes. It optimizes bytecode and removes unused instructions. It \
renames the remaining classes, fields, and methods using short meaningless \
names. Finally, it preverifies the processed code for Java 6 or for Java \
Micro Edition."
LICENSE = "GPL-2.0-or-later"

PV = "6.2.0"

RPM_NAME = "proguard-6.2.0-1.20.noarch.rpm"
RPM_HASH = "bcbe1d2270507d24257801cb82463ade32922dbc9f638dc7a6a16d0a2db101e14afe02b8d8de9a8bfb43b8242c0a68ccc9aacc627d5dbdda49e7c6dd6d26673b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-net.sf.proguard-proguard-annotations \
mvn-net.sf.proguard-proguard-annotations-pom- \
mvn-net.sf.proguard-proguard-base \
mvn-net.sf.proguard-proguard-base-pom- \
mvn-net.sf.proguard-proguard-parent-pom- \
mvn-net.sf.proguard-proguard-retrace \
mvn-net.sf.proguard-proguard-retrace-pom- \
proguard"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm
