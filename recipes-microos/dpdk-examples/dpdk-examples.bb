SUMMARY = "Data Plane Development Kit example applications"
DESCRIPTION = "Example applications utilizing the Data Plane Development Kit, such \
as L2 and L3 forwarding."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-examples-22.11.1-2.4.aarch64.rpm"
RPM_HASH = "06ba85b119803c8ac43d80b47bef769759215fcbf72c5fa7959961c3e03fc0ede5976e46a94c5abae06f8821c79a25fb4e019a7ce599c4f7011b9b4b37c5df0c"

RPROVIDES:${PN} += "dpdk-any-examples \
dpdk-examples \
dpdk-examples(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libfdt.so.1()(64bit) \
libjansson.so.4()(64bit) \
libjansson.so.4(libjansson.so.4)(64bit) \
libm.so.6()(64bit) \
libnuma.so.1()(64bit) \
libpcap.so.1()(64bit) \
librte_acl.so.23()(64bit) \
librte_acl.so.23(DPDK_23)(64bit) \
librte_bbdev.so.23()(64bit) \
librte_bbdev.so.23(DPDK_23)(64bit) \
librte_bus_pci.so.23()(64bit) \
librte_bus_vdev.so.23()(64bit) \
librte_cfgfile.so.23()(64bit) \
librte_cfgfile.so.23(DPDK_23)(64bit) \
librte_cmdline.so.23()(64bit) \
librte_cmdline.so.23(DPDK_23)(64bit) \
librte_crypto_scheduler.so.23()(64bit) \
librte_crypto_scheduler.so.23(DPDK_23)(64bit) \
librte_cryptodev.so.23()(64bit) \
librte_cryptodev.so.23(DPDK_23)(64bit) \
librte_cryptodev.so.23(EXPERIMENTAL)(64bit) \
librte_distributor.so.23()(64bit) \
librte_distributor.so.23(DPDK_23)(64bit) \
librte_dmadev.so.23()(64bit) \
librte_dmadev.so.23(EXPERIMENTAL)(64bit) \
librte_dmadev.so.23(INTERNAL)(64bit) \
librte_eal.so.23()(64bit) \
librte_eal.so.23(DPDK_23)(64bit) \
librte_eal.so.23(EXPERIMENTAL)(64bit) \
librte_efd.so.23()(64bit) \
librte_efd.so.23(DPDK_23)(64bit) \
librte_ethdev.so.23()(64bit) \
librte_ethdev.so.23(DPDK_23)(64bit) \
librte_ethdev.so.23(EXPERIMENTAL)(64bit) \
librte_eventdev.so.23()(64bit) \
librte_eventdev.so.23(DPDK_23)(64bit) \
librte_eventdev.so.23(EXPERIMENTAL)(64bit) \
librte_fib.so.23()(64bit) \
librte_fib.so.23(DPDK_23)(64bit) \
librte_graph.so.23()(64bit) \
librte_graph.so.23(EXPERIMENTAL)(64bit) \
librte_hash.so.23()(64bit) \
librte_hash.so.23(DPDK_23)(64bit) \
librte_ip_frag.so.23()(64bit) \
librte_ip_frag.so.23(DPDK_23)(64bit) \
librte_ipsec.so.23()(64bit) \
librte_ipsec.so.23(DPDK_23)(64bit) \
librte_ipsec.so.23(EXPERIMENTAL)(64bit) \
librte_jobstats.so.23()(64bit) \
librte_jobstats.so.23(DPDK_23)(64bit) \
librte_kvargs.so.23()(64bit) \
librte_lpm.so.23()(64bit) \
librte_lpm.so.23(DPDK_23)(64bit) \
librte_mbuf.so.23()(64bit) \
librte_mbuf.so.23(DPDK_23)(64bit) \
librte_mempool.so.23()(64bit) \
librte_mempool.so.23(DPDK_23)(64bit) \
librte_meter.so.23()(64bit) \
librte_meter.so.23(DPDK_23)(64bit) \
librte_metrics.so.23()(64bit) \
librte_metrics.so.23(DPDK_23)(64bit) \
librte_net.so.23()(64bit) \
librte_net.so.23(DPDK_23)(64bit) \
librte_net_bnxt.so.23()(64bit) \
librte_net_bnxt.so.23(DPDK_23)(64bit) \
librte_net_bond.so.23()(64bit) \
librte_net_bond.so.23(DPDK_23)(64bit) \
librte_net_i40e.so.23()(64bit) \
librte_net_i40e.so.23(DPDK_23)(64bit) \
librte_net_ixgbe.so.23()(64bit) \
librte_net_ixgbe.so.23(DPDK_23)(64bit) \
librte_node.so.23()(64bit) \
librte_node.so.23(EXPERIMENTAL)(64bit) \
librte_pci.so.23()(64bit) \
librte_pipeline.so.23()(64bit) \
librte_pipeline.so.23(DPDK_23)(64bit) \
librte_pipeline.so.23(EXPERIMENTAL)(64bit) \
librte_port.so.23()(64bit) \
librte_port.so.23(DPDK_23)(64bit) \
librte_power.so.23()(64bit) \
librte_power.so.23(DPDK_23)(64bit) \
librte_power.so.23(EXPERIMENTAL)(64bit) \
librte_raw_ntb.so.23()(64bit) \
librte_rawdev.so.23()(64bit) \
librte_rawdev.so.23(DPDK_23)(64bit) \
librte_rcu.so.23()(64bit) \
librte_reorder.so.23()(64bit) \
librte_reorder.so.23(DPDK_23)(64bit) \
librte_reorder.so.23(EXPERIMENTAL)(64bit) \
librte_rib.so.23()(64bit) \
librte_ring.so.23()(64bit) \
librte_ring.so.23(DPDK_23)(64bit) \
librte_sched.so.23()(64bit) \
librte_sched.so.23(DPDK_23)(64bit) \
librte_security.so.23()(64bit) \
librte_security.so.23(DPDK_23)(64bit) \
librte_security.so.23(EXPERIMENTAL)(64bit) \
librte_table.so.23()(64bit) \
librte_table.so.23(DPDK_23)(64bit) \
librte_telemetry.so.23()(64bit) \
librte_telemetry.so.23(DPDK_23)(64bit) \
librte_timer.so.23()(64bit) \
librte_timer.so.23(DPDK_23)(64bit) \
librte_vhost.so.23()(64bit) \
librte_vhost.so.23(DPDK_23)(64bit) \
librte_vhost.so.23(EXPERIMENTAL)(64bit) \
libssl.so.3()(64bit) \
libvirt.so.0()(64bit) \
libvirt.so.0(LIBVIRT_0.0.3)(64bit) \
libvirt.so.0(LIBVIRT_0.1.0)(64bit) \
libvirt.so.0(LIBVIRT_0.1.4)(64bit) \
libvirt.so.0(LIBVIRT_0.7.3)(64bit) \
libvirt.so.0(LIBVIRT_0.8.5)(64bit) \
libvirt.so.0(LIBVIRT_0.9.13)(64bit) \
libvirt.so.0(LIBVIRT_0.9.3)(64bit)"

inherit rpm
