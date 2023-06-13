SUMMARY = "Tool for annotating images"
DESCRIPTION = "kImageAnnotator is a tool for annotating images."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "kImageAnnotator-0.6.1-1.1.aarch64.rpm"
RPM_HASH = "6de7685eb221603684971f78e9ccb12338d04c55d1eb8138cdc776db21bea1840b494583951a3fee8c49538b269307749f35204e89a100710cd82ecced1eb75a"

RPROVIDES:${PN} += "kImageAnnotator \
kImageAnnotator(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
