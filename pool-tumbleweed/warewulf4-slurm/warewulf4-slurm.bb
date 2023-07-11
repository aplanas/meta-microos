SUMMARY = "Configuration template for slurm"
DESCRIPTION = "This package install the necessary configuration files in order to run a slurm \
cluster on the configured warewulf nodes."
LICENSE = "BSD-3-Clause"

PV = "4.4.0"

RPM_NAME = "warewulf4-slurm-4.4.0-6.5.aarch64.rpm"
RPM_HASH = "803fbf7358a5d2d8699441a899c985fd5fe2d9c86c9fcf374ca9128a1bc63a3efdd93f6e5f1c93429efb2ed1c1768043fbce272cc82fbbbd03bc167173b4bdb2"

RPROVIDES:${PN} += "config-warewulf4-slurm \
warewulf4-slurm"

RDEPENDS:${PN} += "slurm \
warewulf4"

inherit rpm
