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

PV = "2.44.0"

RPM_NAME = "golang-github-prometheus-prometheus-2.44.0-1.1.aarch64.rpm"
RPM_HASH = "81115d67da03fa2d8d7ab95f08affe64e947bcea2cba9e58800a4e2f0a21e99a0d36e80a04622a6b62fd740fbd8b13fc81fef055766c8bceb5624adf472a9269"

RPROVIDES:${PN} += "config(golang-github-prometheus-prometheus) \
golang-github-prometheus-prometheus \
golang-github-prometheus-prometheus(aarch-64) \
prometheus"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
group(prometheus) \
user(prometheus)"

inherit rpm
