SUMMARY = "Performance Co-Pilot (PCP) metrics for RabbitMQ queues"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about RabbitMQ message queues."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-rabbitmq-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "da13625419c69d81469332c7e74f89c456d717c4dca151003fc016de3bfcac2080bbb2e4b7aaa08f1f71ef55f610b6dff89117592c30cd4683228e570a46e189"

RPROVIDES:${PN} += "pcp-pmda-rabbitmq"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-pcp"

inherit rpm
