SUMMARY = "Javadoc for jackson-dataformats-binary"
DESCRIPTION = "This package contains API documentation for jackson-dataformats-binary."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "2.15.2"

RPM_NAME = "jackson-dataformats-binary-javadoc-2.15.2-1.1.noarch.rpm"
RPM_HASH = "0dc58a72f101c116eb729f3cffe6ca6ea6d29b4a5db990415ab62e8ead771e1e5f851201b2acb369b6c5f670ceecd343313abd1e8847879a765c00ac1abbc5b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformats-binary-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
