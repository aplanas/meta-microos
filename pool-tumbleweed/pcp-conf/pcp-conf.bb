SUMMARY = "Performance Co-Pilot run-time configuration"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time configuration"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "pcp-conf-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "cb1dd461134fde4031615021b3f57968a5457eb23ce03c21512969c2a1471a6792721acff124482d352ee5043cbd2d162fe72c091902bb6ae0ae34ca2f6e4b4b"

RPROVIDES:${PN} += "config(pcp-conf) \
pcp-conf \
pcp-conf(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
