SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics to Graphite"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
to graphite (http://graphite.readthedocs.org)."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-export-pcp2graphite-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "fee335efbfad4f4245f975fb63b64273b468373c69820b0709d368e6a72aefc0e6071039152bf112173a9b25e6062e943f982faf782461b03e1f9abe9031636d"

RPROVIDES:${PN} += "pcp-export-pcp2graphite"

RDEPENDS:${PN} += "/usr/bin/env \
python3-pcp"

inherit rpm
