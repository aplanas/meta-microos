SUMMARY = "Data Plane Development Kit example applications (thunderx)"
DESCRIPTION = "Example applications utilizing the Data Plane Development Kit, such \
as L2 and L3 forwarding."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-examples-22.11.1-2.16.aarch64.rpm"
RPM_HASH = "8262c76e8396d0035dfd167abc0700af0ed14d5165dfc9b2b29c185886e7308745a119bedc26607778443bb52cdec842ec4594c81bf23205add6f4d70219bd60"

RPROVIDES:${PN} += "dpdk-any-examples \
dpdk-thunderx-examples"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfdt.so.1 \
libjansson.so.4 \
libm.so.6 \
libnuma.so.1 \
libpcap.so.1 \
librte-acl.so.23 \
librte-bbdev.so.23 \
librte-bus-pci.so.23 \
librte-bus-vdev.so.23 \
librte-cfgfile.so.23 \
librte-cmdline.so.23 \
librte-crypto-scheduler.so.23 \
librte-cryptodev.so.23 \
librte-distributor.so.23 \
librte-dmadev.so.23 \
librte-eal.so.23 \
librte-efd.so.23 \
librte-ethdev.so.23 \
librte-eventdev.so.23 \
librte-fib.so.23 \
librte-graph.so.23 \
librte-hash.so.23 \
librte-ip-frag.so.23 \
librte-ipsec.so.23 \
librte-jobstats.so.23 \
librte-kvargs.so.23 \
librte-lpm.so.23 \
librte-mbuf.so.23 \
librte-mempool.so.23 \
librte-meter.so.23 \
librte-metrics.so.23 \
librte-net-bnxt.so.23 \
librte-net-bond.so.23 \
librte-net-i40e.so.23 \
librte-net-ixgbe.so.23 \
librte-net.so.23 \
librte-node.so.23 \
librte-pci.so.23 \
librte-pipeline.so.23 \
librte-port.so.23 \
librte-power.so.23 \
librte-raw-ntb.so.23 \
librte-rawdev.so.23 \
librte-rcu.so.23 \
librte-reorder.so.23 \
librte-rib.so.23 \
librte-ring.so.23 \
librte-sched.so.23 \
librte-security.so.23 \
librte-table.so.23 \
librte-telemetry.so.23 \
librte-timer.so.23 \
librte-vhost.so.23 \
libssl.so.3 \
libvirt.so.0"

inherit rpm
