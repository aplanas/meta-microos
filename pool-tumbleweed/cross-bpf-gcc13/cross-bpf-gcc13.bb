SUMMARY = "The GNU Compiler Collection targeting bpf"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting bpf."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-bpf-gcc13-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "24ac2d9b68198595c352dc9b198f169082b1d9f47539e607afe0c9b967621ad4c3a3a896361392054c73657d7a4657b5463b2cfaa8ac031e013331d31f4d0ffe"

RPROVIDES:${PN} += "cross-bpf-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-bpf-binutils \
update-alternatives"

inherit rpm
