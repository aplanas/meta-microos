SUMMARY = "Utility to show an access matrix for k8s server resources"
DESCRIPTION = "rakkess lists access rights for the current user and all server resources \
on a provided kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "rakkess-0.5.1-1.5.aarch64.rpm"
RPM_HASH = "7ba8c1b51d9608fd951f1e72d86c74e2c1ce90d50b9b87ea7d8cce947d72e6e090fa3e776c919d62ef06678fbc9b3151170c64798066be01a58fdb85cca85ea2"

RPROVIDES:${PN} += "rakkess"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
