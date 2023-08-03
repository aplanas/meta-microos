SUMMARY = "Kernel firmware files for Netronome Flow Processor driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Netronome Flow Processor driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230724"

RPM_NAME = "kernel-firmware-nfp-20230724-1.1.noarch.rpm"
RPM_HASH = "c12002b89ca1e069f333c1d9451632772894b9a6466a1eae5df0fdd2f6aac30bf65b63fa3ed95bd36325397fed9e0484c81d94b182c2a722c2167ac796c2d708"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-netronome/bpf/nic-AMDA0058-0011-2x40.nffw \
firmware-netronome/bpf/nic-AMDA0058-0012-2x40.nffw \
firmware-netronome/bpf/nic-AMDA0078-0011-1x100.nffw \
firmware-netronome/bpf/nic-AMDA0081-0001-1x40.nffw \
firmware-netronome/bpf/nic-AMDA0081-0001-4x10.nffw \
firmware-netronome/bpf/nic-AMDA0096-0001-2x10.nffw \
firmware-netronome/bpf/nic-AMDA0097-0001-2x40.nffw \
firmware-netronome/bpf/nic-AMDA0097-0001-4x10-1x40.nffw \
firmware-netronome/bpf/nic-AMDA0097-0001-8x10.nffw \
firmware-netronome/bpf/nic-AMDA0099-0001-1x10-1x25.nffw \
firmware-netronome/bpf/nic-AMDA0099-0001-2x10.nffw \
firmware-netronome/bpf/nic-AMDA0099-0001-2x25.nffw \
firmware-netronome/flower/nic-AMDA0058-0011-1x100.nffw \
firmware-netronome/flower/nic-AMDA0058-0011-2x40.nffw \
firmware-netronome/flower/nic-AMDA0058-0011-4x10-1x40.nffw \
firmware-netronome/flower/nic-AMDA0058-0011-8x10.nffw \
firmware-netronome/flower/nic-AMDA0058-0012-1x100.nffw \
firmware-netronome/flower/nic-AMDA0058-0012-2x40.nffw \
firmware-netronome/flower/nic-AMDA0058-0012-4x10-1x40.nffw \
firmware-netronome/flower/nic-AMDA0058-0012-8x10.nffw \
firmware-netronome/flower/nic-AMDA0058.nffw \
firmware-netronome/flower/nic-AMDA0078-0011-1x100.nffw \
firmware-netronome/flower/nic-AMDA0078-0011-2x40.nffw \
firmware-netronome/flower/nic-AMDA0078-0011-4x10-1x40.nffw \
firmware-netronome/flower/nic-AMDA0078-0011-8x10.nffw \
firmware-netronome/flower/nic-AMDA0078-0012-1x100.nffw \
firmware-netronome/flower/nic-AMDA0078-0012-2x40.nffw \
firmware-netronome/flower/nic-AMDA0078-0012-4x10-1x40.nffw \
firmware-netronome/flower/nic-AMDA0078-0012-8x10.nffw \
firmware-netronome/flower/nic-AMDA0081-0001-1x40.nffw \
firmware-netronome/flower/nic-AMDA0081-0001-4x10.nffw \
firmware-netronome/flower/nic-AMDA0081.nffw \
firmware-netronome/flower/nic-AMDA0096-0001-2x10.nffw \
firmware-netronome/flower/nic-AMDA0096.nffw \
firmware-netronome/flower/nic-AMDA0097-0001-2x40.nffw \
firmware-netronome/flower/nic-AMDA0097-0001-4x10-1x40.nffw \
firmware-netronome/flower/nic-AMDA0097-0001-8x10.nffw \
firmware-netronome/flower/nic-AMDA0097.nffw \
firmware-netronome/flower/nic-AMDA0099-0001-1x10-1x25.nffw \
firmware-netronome/flower/nic-AMDA0099-0001-2x10.nffw \
firmware-netronome/flower/nic-AMDA0099-0001-2x25.nffw \
firmware-netronome/flower/nic-AMDA0099.nffw \
firmware-netronome/nic-AMDA0058-0011-2x40.nffw \
firmware-netronome/nic-AMDA0058-0012-2x40.nffw \
firmware-netronome/nic-AMDA0078-0011-1x100.nffw \
firmware-netronome/nic-AMDA0081-0001-1x40.nffw \
firmware-netronome/nic-AMDA0081-0001-4x10.nffw \
firmware-netronome/nic-AMDA0096-0001-2x10.nffw \
firmware-netronome/nic-AMDA0097-0001-2x40.nffw \
firmware-netronome/nic-AMDA0097-0001-4x10-1x40.nffw \
firmware-netronome/nic-AMDA0097-0001-8x10.nffw \
firmware-netronome/nic-AMDA0099-0001-1x10-1x25.nffw \
firmware-netronome/nic-AMDA0099-0001-2x10.nffw \
firmware-netronome/nic-AMDA0099-0001-2x25.nffw \
firmware-netronome/nic-sriov/nic-AMDA0058-0011-2x40.nffw \
firmware-netronome/nic-sriov/nic-AMDA0058-0012-2x40.nffw \
firmware-netronome/nic-sriov/nic-AMDA0078-0011-1x100.nffw \
firmware-netronome/nic-sriov/nic-AMDA0081-0001-1x40.nffw \
firmware-netronome/nic-sriov/nic-AMDA0081-0001-4x10.nffw \
firmware-netronome/nic-sriov/nic-AMDA0096-0001-2x10.nffw \
firmware-netronome/nic-sriov/nic-AMDA0097-0001-2x40.nffw \
firmware-netronome/nic-sriov/nic-AMDA0097-0001-4x10-1x40.nffw \
firmware-netronome/nic-sriov/nic-AMDA0097-0001-8x10.nffw \
firmware-netronome/nic-sriov/nic-AMDA0099-0001-1x10-1x25.nffw \
firmware-netronome/nic-sriov/nic-AMDA0099-0001-2x10.nffw \
firmware-netronome/nic-sriov/nic-AMDA0099-0001-2x25.nffw \
firmware-netronome/nic/nic-AMDA0058-0011-2x40.nffw \
firmware-netronome/nic/nic-AMDA0058-0012-2x40.nffw \
firmware-netronome/nic/nic-AMDA0078-0011-1x100.nffw \
firmware-netronome/nic/nic-AMDA0081-0001-1x40.nffw \
firmware-netronome/nic/nic-AMDA0081-0001-4x10.nffw \
firmware-netronome/nic/nic-AMDA0096-0001-2x10.nffw \
firmware-netronome/nic/nic-AMDA0097-0001-2x40.nffw \
firmware-netronome/nic/nic-AMDA0097-0001-4x10-1x40.nffw \
firmware-netronome/nic/nic-AMDA0097-0001-8x10.nffw \
firmware-netronome/nic/nic-AMDA0099-0001-1x10-1x25.nffw \
firmware-netronome/nic/nic-AMDA0099-0001-2x10.nffw \
firmware-netronome/nic/nic-AMDA0099-0001-2x25.nffw \
kernel-firmware-nfp"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
