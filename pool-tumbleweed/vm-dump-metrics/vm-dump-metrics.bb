SUMMARY = "Virtual Host Metrics Daemon (vhostmd)"
DESCRIPTION = "vhostmd provides a 'metrics communication channel' between a host and \
its hosted virtual machines, allowing limited introspection of host \
resource usage from within virtual machines."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1"

RPM_NAME = "vm-dump-metrics-1.1-5.7.aarch64.rpm"
RPM_HASH = "c7d52bb95028819cff2e8fcae28901e1cabfc0c2087d7ef5464bb81b0642d6f7a4ac4b9815859d8a344ae0fb1e2e2d4aef0a09889063597dd0a993c44e614266"

RPROVIDES:${PN} += "vm-dump-metrics"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2"

inherit rpm
