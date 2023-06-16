SUMMARY = "Prometheus Alertmanager"
DESCRIPTION = "The Alertmanager handles alerts sent by client applications such as the \
Prometheus server. It takes care of deduplicating, grouping, and routing \
them to the correct receiver integration such as email, PagerDuty, or \
OpsGenie. It also takes care of silencing and inhibition of alerts."
LICENSE = "Apache-2.0"

PV = "0.25.0"

RPM_NAME = "golang-github-prometheus-alertmanager-0.25.0-2.1.aarch64.rpm"
RPM_HASH = "25b9ce9310671d2468508cb8bcfc1b5419f0941f24c8706d79c9e0d3fe5f2a0c55d4cc538e5d5d4d265cd144169d56dd709fd5510e64ce70a0b114ad37e64c9b"

RPROVIDES:${PN} += "config-golang-github-prometheus-alertmanager \
golang-github-prometheus-alertmanager \
prometheus-alertmanager"

RDEPENDS:${PN} += "/usr/bin/sh \
group-prometheus \
user-prometheus"

inherit rpm
