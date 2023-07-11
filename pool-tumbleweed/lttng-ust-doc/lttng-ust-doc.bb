SUMMARY = "Linux Trace Toolkit Userspace Tracer Documentation"
DESCRIPTION = "This package includes documentation and examples for developing \
applications using LTTng userspace tracing."
LICENSE = "GPL-2.0-only"

PV = "2.13.5"

RPM_NAME = "lttng-ust-doc-2.13.5-1.4.noarch.rpm"
RPM_HASH = "032304e4cdae1d8600a8fc88d2b60614d886b9c3fa29775e02bf692c711282e2b2f01df166d466cd5f2bac84241a91b534d39747d5854e6e759c50e337e2ca9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lttng-ust-doc \
lttng-ust-docs"

RDEPENDS:${PN} += "liblttng-ust-ctl5 \
liblttng-ust-python-agent1 \
liblttng-ust1"

inherit rpm
