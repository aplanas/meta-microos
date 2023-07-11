SUMMARY = "A Mixed Integer Linear Programming (MILP) Solver"
DESCRIPTION = "Mixed Integer Linear Programming (MILP) solver lpsolve solves pure \
linear, (mixed) integer/binary, semi-continuous and special ordered \
sets (SOS) models."
LICENSE = "LGPL-2.0+"

PV = "5.5.2.0"

RPM_NAME = "lpsolve-5.5.2.0-10.29.aarch64.rpm"
RPM_HASH = "4696e697eb3a8c9eeb88de376bd2803c1aae384645a122497d0c773ffb44bdc00ac30f0470c07be246b69e1026e6fc0064fffca1a2b4d187daa9ada444a3915f"

RPROVIDES:${PN} += "lpsolve"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblpsolve55.so.0"

inherit rpm
