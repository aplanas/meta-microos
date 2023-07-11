SUMMARY = "Prometheus Alertmanager"
DESCRIPTION = "The Alertmanager handles alerts sent by client applications such as the \
Prometheus server. It takes care of deduplicating, grouping, and routing \
them to the correct receiver integration such as email, PagerDuty, or \
OpsGenie. It also takes care of silencing and inhibition of alerts."
LICENSE = "Apache-2.0"

PV = "0.25.0"

RPM_NAME = "golang-github-prometheus-alertmanager-0.25.0-2.2.aarch64.rpm"
RPM_HASH = "b4101a85b5d6b3f0371c46beed82af160d522690de9bcc6e4d29d8ceff3ed3724487113fa9d4c5f38392dd1abfedf81527c203f1b37b11cba9e6de4de59c1f0a"

RPROVIDES:${PN} += "config-golang-github-prometheus-alertmanager \
golang-github-prometheus-alertmanager \
prometheus-alertmanager"

RDEPENDS:${PN} += "/usr/bin/sh \
group-prometheus \
user-prometheus"

inherit rpm
