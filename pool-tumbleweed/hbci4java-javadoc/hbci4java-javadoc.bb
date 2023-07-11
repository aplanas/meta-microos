SUMMARY = "Javadoc for hbci4java"
DESCRIPTION = "Developer documentation of HBCI4Java."
LICENSE = "LGPL-2.1-only"

PV = "3.1.64"

RPM_NAME = "hbci4java-javadoc-3.1.64-1.4.noarch.rpm"
RPM_HASH = "4b28d91788792dd5222306e578a78205285126e8416e0991287a520ebe2512e8b5fe6f3b72174f0cad5835534952c937df206a561af416a3ff134a8267aa9105"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hbci4java-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
