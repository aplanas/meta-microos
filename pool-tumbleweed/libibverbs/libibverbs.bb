SUMMARY = "Library & drivers for direct userspace use of InfiniBand/iWARP/RoCE hardware"
DESCRIPTION = "libibverbs is a library that allows userspace processes to use RDMA \
'verbs' as described in the InfiniBand Architecture Specification and \
the RDMA Protocol Verbs Specification.  This includes direct hardware \
access from userspace to InfiniBand/iWARP adapters (kernel bypass) for \
fast path operations. \
 \
Device-specific plug-in ibverbs userspace drivers are included: \
 \
- libcxgb4: Chelsio T4 iWARP HCA \
- libefa: Amazon Elastic Fabric Adapter \
- libhfi1: Intel Omni-Path HFI \
- libhns: HiSilicon Hip06 SoC \
- libi40iw: Intel Ethernet Connection X722 RDMA \
- libipathverbs: QLogic InfiniPath HCA \
- libirdma: Intel Ethernet Connection RDMA \
- libmana: Microsoft Azure Network Adapter \
- libmlx4: Mellanox ConnectX-3 InfiniBand HCA \
- libmlx5: Mellanox Connect-IB/X-4+ InfiniBand HCA \
- libmthca: Mellanox InfiniBand HCA \
- libocrdma: Emulex OneConnect RDMA/RoCE Device \
- libqedr: QLogic QL4xxx RoCE HCA \
- librxe: A software implementation of the RoCE protocol \
- libsiw: A software implementation of the iWarp protocol \
- libvmw_pvrdma: VMware paravirtual RDMA device"
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libibverbs-47.0-3.1.aarch64.rpm"
RPM_HASH = "1427e63516c6475ea8d7a1eb93f50901954f0d12abbeda791c866bce066091a442c06121ab7e5a8b85d2d3f83e0c7435ac466df5104e0945b80d2ab9c76706ef"

RPROVIDES:${PN} += "config-libibverbs \
libbnxt-re-rdmav34.so \
libcxgb4-rdmav34.so \
liberdma-rdmav34.so \
libhfi1verbs-rdmav34.so \
libhns-rdmav34.so \
libibverbs \
libipathverbs-rdmav34.so \
libirdma-rdmav34.so \
libmthca-rdmav34.so \
libocrdma-rdmav34.so \
libqedr-rdmav34.so \
librxe-rdmav34.so \
libsiw-rdmav34.so \
libvmw-pvrdma-rdmav34.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libefa1 \
libibverbs.so.1 \
libmana1 \
libmlx4-1 \
libmlx5-1 \
rdma-core"

inherit rpm
