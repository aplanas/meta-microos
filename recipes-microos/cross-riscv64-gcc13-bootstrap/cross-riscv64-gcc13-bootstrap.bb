SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-riscv64-gcc13-bootstrap-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "c7be59261f4b0f4e9bcf42323ef46cc479cd6772314c2feaf31a06015219ce66597ebc55800c7634e03f0d3ae8fac518b5f573f0f9634123a594a57e38166ac2"

RPROVIDES:${PN} += "cross-riscv64-gcc13-bootstrap cross-riscv64-gcc13-bootstrap(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-riscv64-binutils update-alternatives"

inherit rpm
