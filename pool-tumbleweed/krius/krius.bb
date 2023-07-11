SUMMARY = "Setup Prometheus, Thanos & friends across multiple clusters"
DESCRIPTION = "Krius is a cli tool to setup and manage Prometheus, Thanos & friends across multiple clusters easily for scale"
LICENSE = "Apache-2.0"

PV = "0.1.1"

RPM_NAME = "krius-0.1.1-1.4.aarch64.rpm"
RPM_HASH = "4ad189632def7eb66bdcd816126989f60cca986720a2a04b18caf844b656dcd782897595ac1bff2f1991fa372e066d97484aa310754fe3759654d621d54a83be"

RPROVIDES:${PN} += "krius"

RDEPENDS:${PN} += ""

inherit rpm
