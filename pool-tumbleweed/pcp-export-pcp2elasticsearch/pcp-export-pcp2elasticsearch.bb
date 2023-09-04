SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics to ElasticSearch"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
to Elasticsearch - a distributed, RESTful search and analytics engine. \
See https://www.elastic.co/community for further details."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-export-pcp2elasticsearch-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "40cefe6278417521966efa6e1b779c0c4505c698ba8953533e1707374716dc2c5734a08d9ab5b214aa66192b5dcc6650fcc70419c53fa99d5371ac8d8676bd82"

RPROVIDES:${PN} += "pcp-export-pcp2elasticsearch"

RDEPENDS:${PN} += "/usr/bin/env \
libpcp3 \
python3-pcp \
python3-requests"

inherit rpm
