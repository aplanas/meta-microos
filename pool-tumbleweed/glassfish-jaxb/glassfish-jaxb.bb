SUMMARY = "JAXB Reference Implementation"
DESCRIPTION = "GlassFish JAXB Reference Implementation."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-2.3.1-4.4.noarch.rpm"
RPM_HASH = "d75da5a788dde128b504b23a333fea8a3b827c7527a0aa332b63664a94cdc7912668dec6c821eb301adb320a1b37158a3577f85f94ea841cf22589ff171c0bf3"
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
