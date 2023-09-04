SUMMARY = "Performance Co-Pilot (PCP) metrics for RabbitMQ queues"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about RabbitMQ message queues."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-rabbitmq-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "e5d3a49ea4cd84d3cce5e7695e485b1c08525ef94c273c7dea229e0a98815a1b301c5ff7793efb55336553403ac4a221123a6d2908a26ca898daa958ff65cae7"

RPROVIDES:${PN} += "pcp-pmda-rabbitmq"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-pcp"

inherit rpm
