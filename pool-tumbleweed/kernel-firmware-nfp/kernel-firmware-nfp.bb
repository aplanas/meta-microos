SUMMARY = "Kernel firmware files for Netronome Flow Processor driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Netronome Flow Processor driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "kernel-firmware-nfp-20230517-1.1.noarch.rpm"
RPM_HASH = "8e0a1f08f5dcd00f1550f42e5252e817ec3cf7eea7095ef5200d3d4ee15f872b645b20d7d276c4e85c196ce38c3bb989fcfb898471de40b16f89054a65a21a01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(netronome/bpf/nic_AMDA0058-0011_2x40.nffw) \
firmware(netronome/bpf/nic_AMDA0058-0012_2x40.nffw) \
firmware(netronome/bpf/nic_AMDA0078-0011_1x100.nffw) \
firmware(netronome/bpf/nic_AMDA0081-0001_1x40.nffw) \
firmware(netronome/bpf/nic_AMDA0081-0001_4x10.nffw) \
firmware(netronome/bpf/nic_AMDA0096-0001_2x10.nffw) \
firmware(netronome/bpf/nic_AMDA0097-0001_2x40.nffw) \
firmware(netronome/bpf/nic_AMDA0097-0001_4x10_1x40.nffw) \
firmware(netronome/bpf/nic_AMDA0097-0001_8x10.nffw) \
firmware(netronome/bpf/nic_AMDA0099-0001_1x10_1x25.nffw) \
firmware(netronome/bpf/nic_AMDA0099-0001_2x10.nffw) \
firmware(netronome/bpf/nic_AMDA0099-0001_2x25.nffw) \
firmware(netronome/flower/nic_AMDA0058-0011_1x100.nffw) \
firmware(netronome/flower/nic_AMDA0058-0011_2x40.nffw) \
firmware(netronome/flower/nic_AMDA0058-0011_4x10_1x40.nffw) \
firmware(netronome/flower/nic_AMDA0058-0011_8x10.nffw) \
firmware(netronome/flower/nic_AMDA0058-0012_1x100.nffw) \
firmware(netronome/flower/nic_AMDA0058-0012_2x40.nffw) \
firmware(netronome/flower/nic_AMDA0058-0012_4x10_1x40.nffw) \
firmware(netronome/flower/nic_AMDA0058-0012_8x10.nffw) \
firmware(netronome/flower/nic_AMDA0058.nffw) \
firmware(netronome/flower/nic_AMDA0078-0011_1x100.nffw) \
firmware(netronome/flower/nic_AMDA0078-0011_2x40.nffw) \
firmware(netronome/flower/nic_AMDA0078-0011_4x10_1x40.nffw) \
firmware(netronome/flower/nic_AMDA0078-0011_8x10.nffw) \
firmware(netronome/flower/nic_AMDA0078-0012_1x100.nffw) \
firmware(netronome/flower/nic_AMDA0078-0012_2x40.nffw) \
firmware(netronome/flower/nic_AMDA0078-0012_4x10_1x40.nffw) \
firmware(netronome/flower/nic_AMDA0078-0012_8x10.nffw) \
firmware(netronome/flower/nic_AMDA0081-0001_1x40.nffw) \
firmware(netronome/flower/nic_AMDA0081-0001_4x10.nffw) \
firmware(netronome/flower/nic_AMDA0081.nffw) \
firmware(netronome/flower/nic_AMDA0096-0001_2x10.nffw) \
firmware(netronome/flower/nic_AMDA0096.nffw) \
firmware(netronome/flower/nic_AMDA0097-0001_2x40.nffw) \
firmware(netronome/flower/nic_AMDA0097-0001_4x10_1x40.nffw) \
firmware(netronome/flower/nic_AMDA0097-0001_8x10.nffw) \
firmware(netronome/flower/nic_AMDA0097.nffw) \
firmware(netronome/flower/nic_AMDA0099-0001_1x10_1x25.nffw) \
firmware(netronome/flower/nic_AMDA0099-0001_2x10.nffw) \
firmware(netronome/flower/nic_AMDA0099-0001_2x25.nffw) \
firmware(netronome/flower/nic_AMDA0099.nffw) \
firmware(netronome/nic-sriov/nic_AMDA0058-0011_2x40.nffw) \
firmware(netronome/nic-sriov/nic_AMDA0058-0012_2x40.nffw) \
firmware(netronome/nic-sriov/nic_AMDA0078-0011_1x100.nffw) \
firmware(netronome/nic-sriov/nic_AMDA0081-0001_1x40.nffw) \
firmware(netronome/nic-sriov/nic_AMDA0081-0001_4x10.nffw) \
firmware(netronome/nic-sriov/nic_AMDA0096-0001_2x10.nffw) \
firmware(netronome/nic-sriov/nic_AMDA0097-0001_2x40.nffw) \
firmware(netronome/nic-sriov/nic_AMDA0097-0001_4x10_1x40.nffw) \
firmware(netronome/nic-sriov/nic_AMDA0097-0001_8x10.nffw) \
firmware(netronome/nic-sriov/nic_AMDA0099-0001_1x10_1x25.nffw) \
firmware(netronome/nic-sriov/nic_AMDA0099-0001_2x10.nffw) \
firmware(netronome/nic-sriov/nic_AMDA0099-0001_2x25.nffw) \
firmware(netronome/nic/nic_AMDA0058-0011_2x40.nffw) \
firmware(netronome/nic/nic_AMDA0058-0012_2x40.nffw) \
firmware(netronome/nic/nic_AMDA0078-0011_1x100.nffw) \
firmware(netronome/nic/nic_AMDA0081-0001_1x40.nffw) \
firmware(netronome/nic/nic_AMDA0081-0001_4x10.nffw) \
firmware(netronome/nic/nic_AMDA0096-0001_2x10.nffw) \
firmware(netronome/nic/nic_AMDA0097-0001_2x40.nffw) \
firmware(netronome/nic/nic_AMDA0097-0001_4x10_1x40.nffw) \
firmware(netronome/nic/nic_AMDA0097-0001_8x10.nffw) \
firmware(netronome/nic/nic_AMDA0099-0001_1x10_1x25.nffw) \
firmware(netronome/nic/nic_AMDA0099-0001_2x10.nffw) \
firmware(netronome/nic/nic_AMDA0099-0001_2x25.nffw) \
firmware(netronome/nic_AMDA0058-0011_2x40.nffw) \
firmware(netronome/nic_AMDA0058-0012_2x40.nffw) \
firmware(netronome/nic_AMDA0078-0011_1x100.nffw) \
firmware(netronome/nic_AMDA0081-0001_1x40.nffw) \
firmware(netronome/nic_AMDA0081-0001_4x10.nffw) \
firmware(netronome/nic_AMDA0096-0001_2x10.nffw) \
firmware(netronome/nic_AMDA0097-0001_2x40.nffw) \
firmware(netronome/nic_AMDA0097-0001_4x10_1x40.nffw) \
firmware(netronome/nic_AMDA0097-0001_8x10.nffw) \
firmware(netronome/nic_AMDA0099-0001_1x10_1x25.nffw) \
firmware(netronome/nic_AMDA0099-0001_2x10.nffw) \
firmware(netronome/nic_AMDA0099-0001_2x25.nffw) \
kernel-firmware-nfp"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
dracut"

inherit rpm
