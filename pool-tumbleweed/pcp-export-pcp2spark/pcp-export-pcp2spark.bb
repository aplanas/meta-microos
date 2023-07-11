SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics to Apache Spark"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
in JSON format to Apache Spark. See https://spark.apache.org/ for \
further details on Apache Spark."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-export-pcp2spark-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "1e36ef25a47f8dd9e5a277e81c96c12505244a296fef45f99915db31042df5452ca786924cfdf4bdd645e78ab51f17c3e57f6a525d4e95db91e26a157a6995a5"

RPROVIDES:${PN} += "pcp-export-pcp2spark"

RDEPENDS:${PN} += "/usr/bin/env \
libpcp3 \
python3-pcp"

inherit rpm
