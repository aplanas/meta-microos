SUMMARY = "Ant task for proguard"
DESCRIPTION = "Ant task for proguard"
LICENSE = "GPL-2.0-or-later"

PV = "6.2.0"

RPM_NAME = "ant-proguard-6.2.0-1.19.noarch.rpm"
RPM_HASH = "8936f878e4b580be364aa51ced84b9dfececbb0a63838983aaa27702fec155db69bc8672d9233b6fb490100adc5e3effa17167e7d8a767d92de02ad8c583889b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-proguard config(ant-proguard) mvn(net.sf.proguard:proguard-anttask) mvn(net.sf.proguard:proguard-anttask:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(net.sf.proguard:proguard-base)"

inherit rpm
