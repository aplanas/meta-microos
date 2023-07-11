SUMMARY = "Example bpftrace scripts and other useful snippets"
DESCRIPTION = "Collection of tools for quick instrumentation and inspection of a running \
system. These are all BPFtrace scripts within /usr/share/bpftrace, and can be \
easily modified to allow for different types of debugging."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "bpftrace-tools-0.17.0-2.4.noarch.rpm"
RPM_HASH = "1576a168a43378a86712b667aa5100050ce2b62d240aad94a6ef91e5e57dc9734cf17d283c190e8ff700051749333ad292d9e1911b3d9552ac1ed51f72cb2c41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bpftrace-tools"

RDEPENDS:${PN} += "/usr/bin/bpftrace \
bpftrace"

inherit rpm
