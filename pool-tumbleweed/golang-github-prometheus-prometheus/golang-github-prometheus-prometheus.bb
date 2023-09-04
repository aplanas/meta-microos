SUMMARY = "The Prometheus monitoring system and time series database"
DESCRIPTION = "Prometheus's main features are: \
 - a multi-dimensional data model (time series identified by metric name and key/value pairs) \
 - a flexible query language to leverage this dimensionality \
 - no reliance on distributed storage; single server nodes are autonomous \
 - time series collection happens via a pull model over HTTP \
 - pushing time series is supported via an intermediary gateway \
 - targets are discovered via service discovery or static configuration \
 - multiple modes of graphing and dashboarding support"
LICENSE = "Apache-2.0"

PV = "2.46.0"

RPM_NAME = "golang-github-prometheus-prometheus-2.46.0-2.1.aarch64.rpm"
RPM_HASH = "586f34af6f3168ca55e0c02506cea9e890a98997779b154bc562d2e460b7edae98e24482e57f80d36b9d0225062121801e9a56f5559ade28ff959f1f6490ebc2"

RPROVIDES:${PN} += "config-golang-github-prometheus-prometheus \
golang-github-prometheus-prometheus \
prometheus"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-prometheus \
user-prometheus"

inherit rpm
