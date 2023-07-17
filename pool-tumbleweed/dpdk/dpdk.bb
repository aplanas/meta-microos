SUMMARY = "Set of libraries and drivers for fast packet processing"
DESCRIPTION = "The Data Plane Development Kit is a set of libraries and drivers for \
fast packet processing in the user space."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-22.11.1-2.9.aarch64.rpm"
RPM_HASH = "2b7d98898d92210ba2c86cd3a0c4001dfc9207f6c615561ec05585ad5a38f1926d96694b8f3b34334563746bf2697bc43fbf57d67fc7e7a9c102d476061bcbfd"

RPROVIDES:${PN} += "dpdk \
dpdk-any"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libelf.so.1 \
libfdt.so.1 \
libibverbs.so.1 \
libjansson.so.4 \
libm.so.6 \
libmlx5.so.1 \
libnuma.so.1 \
libpcap.so.1 \
librte-acl.so.23 \
librte-baseband-acc.so.23 \
librte-baseband-fpga-5gnr-fec.so.23 \
librte-baseband-fpga-lte-fec.so.23 \
librte-bbdev.so.23 \
librte-bitratestats.so.23 \
librte-bpf.so.23 \
librte-bus-auxiliary.so.23 \
librte-bus-dpaa.so.23 \
librte-bus-pci.so.23 \
librte-bus-vdev.so.23 \
librte-cfgfile.so.23 \
librte-cmdline.so.23 \
librte-common-dpaax.so.23 \
librte-common-iavf.so.23 \
librte-common-mlx5.so.23 \
librte-compressdev.so.23 \
librte-crypto-scheduler.so.23 \
librte-cryptodev.so.23 \
librte-distributor.so.23 \
librte-dmadev.so.23 \
librte-eal.so.23 \
librte-efd.so.23 \
librte-ethdev.so.23 \
librte-event-skeleton.so.23 \
librte-eventdev.so.23 \
librte-fib.so.23 \
librte-gpudev.so.23 \
librte-graph.so.23 \
librte-gro.so.23 \
librte-gso.so.23 \
librte-hash.so.23 \
librte-ip-frag.so.23 \
librte-ipsec.so.23 \
librte-jobstats.so.23 \
librte-kvargs.so.23 \
librte-latencystats.so.23 \
librte-lpm.so.23 \
librte-mbuf.so.23 \
librte-member.so.23 \
librte-mempool-dpaa.so.23 \
librte-mempool-ring.so.23 \
librte-mempool-stack.so.23 \
librte-mempool.so.23 \
librte-meter.so.23 \
librte-metrics.so.23 \
librte-net-bnxt.so.23 \
librte-net-bond.so.23 \
librte-net-dpaa.so.23 \
librte-net-i40e.so.23 \
librte-net-ice.so.23 \
librte-net-ixgbe.so.23 \
librte-net-mlx5.so.23 \
librte-net-null.so.23 \
librte-net-ring.so.23 \
librte-net.so.23 \
librte-node.so.23 \
librte-pcapng.so.23 \
librte-pci.so.23 \
librte-pdump.so.23 \
librte-pipeline.so.23 \
librte-port.so.23 \
librte-power.so.23 \
librte-rawdev.so.23 \
librte-rcu.so.23 \
librte-regexdev.so.23 \
librte-reorder.so.23 \
librte-rib.so.23 \
librte-ring.so.23 \
librte-sched.so.23 \
librte-security.so.23 \
librte-stack.so.23 \
librte-table.so.23 \
librte-telemetry.so.23 \
librte-timer.so.23 \
librte-vhost.so.23 \
libz.so.1"

inherit rpm
