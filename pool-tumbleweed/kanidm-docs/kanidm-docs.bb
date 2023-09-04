SUMMARY = "Documentation for Kanidm Administration"
DESCRIPTION = "Documentation for using and configuring Kanidm."
LICENSE = "MPL-2.0"

PV = "1.1.0~beta13~git7.1fb34a9"

RPM_NAME = "kanidm-docs-1.1.0~beta13~git7.1fb34a9-1.1.aarch64.rpm"
RPM_HASH = "6eb60b306104e3e1ee3150dc566a26bac3fa0e5be07348ae71c5f4043b803f1864f6cc10289e3b71fd509c6831dbbf146c6e4b34f59ed6a84ae859d93846db49"

RPROVIDES:${PN} += "kanidm-docs"

RDEPENDS:${PN} += ""

inherit rpm
