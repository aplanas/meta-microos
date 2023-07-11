SUMMARY = "Warewulf Node Health Check (NHC)"
DESCRIPTION = "Warewulf Node Health Check (NHC) is a periodic 'node health check' script to be \
executed on each compute node to verify that the node is working properly. Nodes \
which are determined to be 'unhealthy' can be marked as down or offline so as to \
prevent jobs from being scheduled or run on them. This helps increase the \
reliability and throughput of a cluster by reducing preventable job failures due \
to misconfiguration, hardware failures, etc."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "warewulf-nhc-1.4.2-1.10.noarch.rpm"
RPM_HASH = "77e65f3d12fd9b4da93ec351131b196f5bdfeeea4b4c9f7a0e93e249b0558b101002b2b586833e98f69ca1f64046b62084123cb223ef9869a5c550e013fcb64e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-warewulf-nhc \
warewulf-nhc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
bash \
logrotate"

inherit rpm
