SUMMARY = "JAXB Reference Implementation"
DESCRIPTION = "GlassFish JAXB Reference Implementation."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-2.3.1-4.5.noarch.rpm"
RPM_HASH = "f3f2ae503cb28a191f41b53ac94d4f68a2b5729e455d7de50c399e62d6eb2101e7471301f5a0d9340fad3f53472eb557cd74aacd956118e26f565cc81a0e6703"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb"

RDEPENDS:${PN} += "glassfish-jaxb-bom \
glassfish-jaxb-bom-ext \
glassfish-jaxb-codemodel \
glassfish-jaxb-codemodel-annotation-compiler \
glassfish-jaxb-codemodel-parent \
glassfish-jaxb-external-parent \
glassfish-jaxb-jxc \
glassfish-jaxb-parent \
glassfish-jaxb-relaxng-datatype \
glassfish-jaxb-rngom \
glassfish-jaxb-runtime \
glassfish-jaxb-runtime-parent \
glassfish-jaxb-txw-parent \
glassfish-jaxb-txw2 \
glassfish-jaxb-txwc2 \
glassfish-jaxb-xjc \
glassfish-jaxb-xsom"

inherit rpm
