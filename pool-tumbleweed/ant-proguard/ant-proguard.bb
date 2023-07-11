SUMMARY = "Ant task for proguard"
DESCRIPTION = "Ant task for proguard"
LICENSE = "GPL-2.0-or-later"

PV = "6.2.0"

RPM_NAME = "ant-proguard-6.2.0-1.20.noarch.rpm"
RPM_HASH = "304810ec3e5ac67bb86946b3ff1a7351c875945c80b24dd6f62ee145a318b520ad95fa58ce979cc991d7672af5c64d25e7f271e1c49e0950d0c19a80d617d147"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-proguard \
config-ant-proguard \
mvn-net.sf.proguard-proguard-anttask \
mvn-net.sf.proguard-proguard-anttask-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-net.sf.proguard-proguard-base"

inherit rpm
