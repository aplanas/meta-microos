SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics to Graphite"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
to graphite (http://graphite.readthedocs.org)."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-export-pcp2graphite-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "ffa18624e901348fc0b6cb0b22304590fda6e41b5eee1033ea104c33fa7b3f9d614addd96fa18dceceba4cea641eabb2c89f14ac65bac005baebb97e54520272"

RPROVIDES:${PN} += "pcp-export-pcp2graphite"

RDEPENDS:${PN} += "/usr/bin/env \
python3-pcp"

inherit rpm
