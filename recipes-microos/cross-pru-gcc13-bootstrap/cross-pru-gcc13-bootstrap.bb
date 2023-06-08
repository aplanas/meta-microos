SUMMARY = "The GNU Compiler Collection targeting pru"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting pru. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-pru-gcc13-bootstrap-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "e281b7d50ccb91a0f737fdbe2a0807b1d7c9b7e05e78dadf5716eae2d8a755a737d505dc6fb957e15b23b7f5efd7ced212faf9ce6ce826e482e84a703199caa2"

RPROVIDES:${PN} += "cross-pru-gcc13-bootstrap cross-pru-gcc13-bootstrap(aarch-64) pru-gcc"
RDEPENDS:${PN} += "/bin/sh cross-pru-binutils update-alternatives"

inherit rpm
