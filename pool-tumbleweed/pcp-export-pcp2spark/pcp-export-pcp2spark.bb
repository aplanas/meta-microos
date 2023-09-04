SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics to Apache Spark"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
in JSON format to Apache Spark. See https://spark.apache.org/ for \
further details on Apache Spark."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-export-pcp2spark-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "53a026d87b5c9e954dd33c488c5a6a969275bb06c1a4a8eed8608ca2b2a6149dca0fbda0e4d65cf8d362b79d26712ad5821b8b2786af1c44095db839eaf59ab2"

RPROVIDES:${PN} += "pcp-export-pcp2spark"

RDEPENDS:${PN} += "/usr/bin/env \
libpcp3 \
python3-pcp"

inherit rpm
