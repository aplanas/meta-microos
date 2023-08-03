SUMMARY = "The GNU Compiler Collection targeting bpf"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting bpf."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-bpf-gcc13-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "ab556ae7b883088715597075c07acff387cc51ded3131d1aae204027098e0685283b89c4f0500c5e5bfc90f5c6efe59e439c58976f708b56c9a914820569a7ca"

RPROVIDES:${PN} += "cross-bpf-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-bpf-binutils \
update-alternatives"

inherit rpm
