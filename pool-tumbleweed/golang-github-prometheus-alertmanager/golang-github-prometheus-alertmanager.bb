SUMMARY = "Prometheus Alertmanager"
DESCRIPTION = "The Alertmanager handles alerts sent by client applications such as the \
Prometheus server. It takes care of deduplicating, grouping, and routing \
them to the correct receiver integration such as email, PagerDuty, or \
OpsGenie. It also takes care of silencing and inhibition of alerts."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "golang-github-prometheus-alertmanager-0.26.0-1.1.aarch64.rpm"
RPM_HASH = "a96faca265b062c76026f51e9b2d24404d903e99b20fb676e1247026852f06ec8e4b1b0d4f2e89e3c63f1583f6a3878559378add245ae9d9c01e50585905e008"

RPROVIDES:${PN} += "config-golang-github-prometheus-alertmanager \
golang-github-prometheus-alertmanager \
prometheus-alertmanager"

RDEPENDS:${PN} += "/usr/bin/sh \
group-prometheus \
user-prometheus"

inherit rpm
