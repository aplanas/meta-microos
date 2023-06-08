SUMMARY = "Example bpftrace scripts and other useful snippets"
DESCRIPTION = "Collection of tools for quick instrumentation and inspection of a running \
system. These are all BPFtrace scripts within /usr/share/bpftrace, and can be \
easily modified to allow for different types of debugging."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "bpftrace-tools-0.17.0-2.3.noarch.rpm"
RPM_HASH = "6904fdad3f1bf8502a529880bc9cc2fdb4165cebd545643718a7dcdaadc4677344a48f4375e77e968bf745a436db9b864f8b4a15eba8d520cef4bad5ff7cfc8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bpftrace-tools"
RDEPENDS:${PN} += "/usr/bin/bpftrace bpftrace"

inherit rpm
