SUMMARY = "Show pods/containers which have recently been 'OOMKilled'"
DESCRIPTION = "kubectl plugin to display the pods and containers which have recently been OOMKilled."
LICENSE = "Apache-2.0"

PV = "0.0.7"

RPM_NAME = "kubectl-oomd-0.0.7-1.4.aarch64.rpm"
RPM_HASH = "3f23c57228018262e590bd693acecb37d1068cc6c7957afb90b450a9c78426ff8ad7839ce4fcc0c2a7ba4212234adfa49b22417ecb3cc2adc297f64ae3a66a5c"

RPROVIDES:${PN} += "kubectl-oomd \
kubectl-oomd(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
