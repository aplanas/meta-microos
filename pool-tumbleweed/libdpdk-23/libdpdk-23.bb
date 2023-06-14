SUMMARY = "Data Plane Development Kit runtime libraries"
DESCRIPTION = "This package contains the runtime libraries needed for 3rd party application \
to use the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "libdpdk-23-22.11.1-2.4.aarch64.rpm"
RPM_HASH = "b270a1b192a51634ab2d08e73788fca8e8c2b79941690623cdf8570d2e9ab7dd794b20a1245a11594af65fa51ec99c7e84b9d9d49fe040abe1753841c8bc8f6d"

RPROVIDES:${PN} += "libdpdk-23 \
libdpdk-23-any \
librte-acl.so.23 \
librte-baseband-acc.so.23 \
librte-baseband-fpga-5gnr-fec.so.23 \
librte-baseband-fpga-lte-fec.so.23 \
librte-baseband-la12xx.so.23 \
librte-baseband-null.so.23 \
librte-baseband-turbo-sw.so.23 \
librte-bbdev.so.23 \
librte-bitratestats.so.23 \
librte-bpf.so.23 \
librte-bus-auxiliary.so.23 \
librte-bus-dpaa.so.23 \
librte-bus-fslmc.so.23 \
librte-bus-ifpga.so.23 \
librte-bus-pci.so.23 \
librte-bus-vdev.so.23 \
librte-bus-vmbus.so.23 \
librte-cfgfile.so.23 \
librte-cmdline.so.23 \
librte-common-cnxk.so.23 \
librte-common-cpt.so.23 \
librte-common-dpaax.so.23 \
librte-common-iavf.so.23 \
librte-common-idpf.so.23 \
librte-common-mlx5.so.23 \
librte-common-octeontx.so.23 \
librte-common-qat.so.23 \
librte-common-sfc-efx.so.23 \
librte-compress-mlx5.so.23 \
librte-compress-octeontx.so.23 \
librte-compress-zlib.so.23 \
librte-compressdev.so.23 \
librte-crypto-bcmfs.so.23 \
librte-crypto-caam-jr.so.23 \
librte-crypto-ccp.so.23 \
librte-crypto-cnxk.so.23 \
librte-crypto-dpaa-sec.so.23 \
librte-crypto-dpaa2-sec.so.23 \
librte-crypto-mlx5.so.23 \
librte-crypto-nitrox.so.23 \
librte-crypto-null.so.23 \
librte-crypto-octeontx.so.23 \
librte-crypto-openssl.so.23 \
librte-crypto-scheduler.so.23 \
librte-crypto-virtio.so.23 \
librte-cryptodev.so.23 \
librte-distributor.so.23 \
librte-dma-cnxk.so.23 \
librte-dma-dpaa.so.23 \
librte-dma-dpaa2.so.23 \
librte-dma-hisilicon.so.23 \
librte-dma-skeleton.so.23 \
librte-dmadev.so.23 \
librte-eal.so.23 \
librte-efd.so.23 \
librte-ethdev.so.23 \
librte-event-cnxk.so.23 \
librte-event-dpaa.so.23 \
librte-event-dpaa2.so.23 \
librte-event-dsw.so.23 \
librte-event-octeontx.so.23 \
librte-event-opdl.so.23 \
librte-event-skeleton.so.23 \
librte-event-sw.so.23 \
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
librte-mempool-bucket.so.23 \
librte-mempool-cnxk.so.23 \
librte-mempool-dpaa.so.23 \
librte-mempool-dpaa2.so.23 \
librte-mempool-octeontx.so.23 \
librte-mempool-ring.so.23 \
librte-mempool-stack.so.23 \
librte-mempool.so.23 \
librte-meter.so.23 \
librte-metrics.so.23 \
librte-net-af-packet.so.23 \
librte-net-ark.so.23 \
librte-net-atlantic.so.23 \
librte-net-avp.so.23 \
librte-net-axgbe.so.23 \
librte-net-bnx2x.so.23 \
librte-net-bnxt.so.23 \
librte-net-bond.so.23 \
librte-net-cnxk.so.23 \
librte-net-cxgbe.so.23 \
librte-net-dpaa.so.23 \
librte-net-dpaa2.so.23 \
librte-net-e1000.so.23 \
librte-net-ena.so.23 \
librte-net-enetc.so.23 \
librte-net-enetfec.so.23 \
librte-net-enic.so.23 \
librte-net-failsafe.so.23 \
librte-net-fm10k.so.23 \
librte-net-gve.so.23 \
librte-net-hinic.so.23 \
librte-net-hns3.so.23 \
librte-net-i40e.so.23 \
librte-net-iavf.so.23 \
librte-net-ice.so.23 \
librte-net-idpf.so.23 \
librte-net-igc.so.23 \
librte-net-ionic.so.23 \
librte-net-ipn3ke.so.23 \
librte-net-ixgbe.so.23 \
librte-net-liquidio.so.23 \
librte-net-memif.so.23 \
librte-net-mlx4.so.23 \
librte-net-mlx5.so.23 \
librte-net-netvsc.so.23 \
librte-net-nfp.so.23 \
librte-net-ngbe.so.23 \
librte-net-null.so.23 \
librte-net-octeon-ep.so.23 \
librte-net-octeontx.so.23 \
librte-net-pcap.so.23 \
librte-net-pfe.so.23 \
librte-net-qede.so.23 \
librte-net-ring.so.23 \
librte-net-sfc.so.23 \
librte-net-softnic.so.23 \
librte-net-tap.so.23 \
librte-net-thunderx.so.23 \
librte-net-txgbe.so.23 \
librte-net-vdev-netvsc.so.23 \
librte-net-vhost.so.23 \
librte-net-virtio.so.23 \
librte-net-vmxnet3.so.23 \
librte-net.so.23 \
librte-node.so.23 \
librte-pcapng.so.23 \
librte-pci.so.23 \
librte-pdump.so.23 \
librte-pipeline.so.23 \
librte-port.so.23 \
librte-power.so.23 \
librte-raw-cnxk-bphy.so.23 \
librte-raw-cnxk-gpio.so.23 \
librte-raw-dpaa2-cmdif.so.23 \
librte-raw-ifpga.so.23 \
librte-raw-ntb.so.23 \
librte-raw-skeleton.so.23 \
librte-rawdev.so.23 \
librte-rcu.so.23 \
librte-regex-cn9k.so.23 \
librte-regex-mlx5.so.23 \
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
librte-vdpa-ifc.so.23 \
librte-vdpa-mlx5.so.23 \
librte-vdpa-sfc.so.23 \
librte-vhost.so.23"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatomic.so.1 \
libc.so.6 \
libcrypto.so.3 \
libelf.so.1 \
libfdt.so.1 \
libibverbs.so.1 \
libjansson.so.4 \
libm.so.6 \
libmlx4.so.1 \
libmlx5.so.1 \
libnuma.so.1 \
libpcap.so.1 \
libz.so.1"

inherit rpm
