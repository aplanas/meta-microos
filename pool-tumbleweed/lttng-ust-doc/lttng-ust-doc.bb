SUMMARY = "Linux Trace Toolkit Userspace Tracer Documentation"
DESCRIPTION = "This package includes documentation and examples for developing \
applications using LTTng userspace tracing."
LICENSE = "GPL-2.0-only"

PV = "2.13.5"

RPM_NAME = "lttng-ust-doc-2.13.5-1.3.noarch.rpm"
RPM_HASH = "194dd13fc18746f2430e88d8008a0b9f820bfafea473590d75cf3e2dd89a166414f4e72ef7ae42f33c623332ed1e031ff09df606a3c16c72f59d7941fcf50afc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lttng-ust-doc \
lttng-ust-docs"
RDEPENDS:${PN} += "liblttng-ust-ctl5 \
liblttng-ust-python-agent1 \
liblttng-ust1"

inherit rpm
