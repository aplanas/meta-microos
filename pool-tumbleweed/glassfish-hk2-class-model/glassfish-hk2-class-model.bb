SUMMARY = "Class Model for Hk2"
DESCRIPTION = "Hundred Kilobytes Kernel Class Model."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-class-model-2.5.0-2.4.noarch.rpm"
RPM_HASH = "ae962f1099afefe538905c546180b42663a9dabcf5a29559e24c3372f686e85336596c32e0ed8b7d5ddb31774247492e8a700eebc2baa644b6d1e33c58067a9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-class-model \
mvn-org.glassfish.hk2-class-model \
mvn-org.glassfish.hk2-class-model-pom- \
osgi-org.glassfish.hk2.class-model"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.ow2.asm-asm-all"

inherit rpm
