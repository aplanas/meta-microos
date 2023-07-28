SUMMARY = "HTML documentation for systemd"
DESCRIPTION = "The HTML documentation for systemd."
LICENSE = "LGPL-2.1-or-later"

PV = "253.7"

RPM_NAME = "systemd-doc-253.7-1.2.aarch64.rpm"
RPM_HASH = "8cf759e94952dddf989995260ac3cdcffe940b58ddbf18c261d5bcfafc6ec8730255c8636477b76cc906955f3587f104f396dd5cab719d97398fd261f5925ac4"

RPROVIDES:${PN} += "systemd-doc"

RDEPENDS:${PN} += ""

inherit rpm
