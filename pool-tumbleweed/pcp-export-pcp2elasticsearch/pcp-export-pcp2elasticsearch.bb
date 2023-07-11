SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics to ElasticSearch"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
to Elasticsearch - a distributed, RESTful search and analytics engine. \
See https://www.elastic.co/community for further details."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-export-pcp2elasticsearch-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "3efdda9af9c26d087ee729eab76bbf2c260f1a18e6e7ed60fb3dec0a9d615d03473237372b5c6b44ff5bca2be3ff78755c0fed1fc79167e919321e1271a6afa2"

RPROVIDES:${PN} += "pcp-export-pcp2elasticsearch"

RDEPENDS:${PN} += "/usr/bin/env \
libpcp3 \
python3-pcp \
python3-requests"

inherit rpm
