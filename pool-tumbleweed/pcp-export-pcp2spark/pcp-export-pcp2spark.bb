SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics to Apache Spark"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
in JSON format to Apache Spark. See https://spark.apache.org/ for \
further details on Apache Spark."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-export-pcp2spark-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "2b7c62bf98979eb027a5df2133d5453d8f5fd25813b271174e18b81ecaf442ee41c58f2b5032c058a099afe5ee8014fc6f8df901e1b36f41fcf471573d94ee32"

RPROVIDES:${PN} += "pcp-export-pcp2spark"

RDEPENDS:${PN} += "/usr/bin/env \
libpcp3 \
python3-pcp"

inherit rpm
