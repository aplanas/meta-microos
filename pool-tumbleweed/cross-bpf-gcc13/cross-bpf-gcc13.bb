SUMMARY = "The GNU Compiler Collection targeting bpf"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting bpf."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-bpf-gcc13-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "badc355f9d4299aad8b472a61921bc437ac808ea2e09332da8e9460c378ad325b156c2a21d3770282d9c3e881525ffff1811439639a80be51e96a60061dde992"

RPROVIDES:${PN} += "cross-bpf-gcc13 \
cross-bpf-gcc13(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
cross-bpf-binutils \
update-alternatives"

inherit rpm
