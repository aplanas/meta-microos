SUMMARY = "Kernel firmware files for Netronome Flow Processor driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Netronome Flow Processor driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230707"

RPM_NAME = "kernel-firmware-nfp-20230707-1.1.noarch.rpm"
RPM_HASH = "1f1a479983b168d8e75b7a9bf5a7e55bd651a6d2baf2fef33e8f118fc74d5a74a67b0913664ed36e596bad53e70d26159c100b39beb94b4075f0749515ae88e0"
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
