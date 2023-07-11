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

PV = "2.45.0"

RPM_NAME = "golang-github-prometheus-prometheus-2.45.0-1.1.aarch64.rpm"
RPM_HASH = "0e92f67d785111f98e52b3f3eaf7f19af4a5038abdcc1c60efa616903888f7cdf12acec0ef8d4808700617eb2eac73415001fb7950b0d27e9c4928e1628c7dd2"

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
