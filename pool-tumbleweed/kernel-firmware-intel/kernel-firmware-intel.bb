SUMMARY = "Kernel firmware files for Intel-platform device drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Intel-platform device drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "kernel-firmware-intel-20230517-1.1.noarch.rpm"
RPM_HASH = "23dad8adfbec187a129177881fbf774604317c0209f4abe73cdbdd445bbbb38ff4f3fe1f9d10f1eb872b64049b9258a48324c152908e6e5b9b4c5c3665f37d5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(hfi1_dc8051.fw) \
firmware(hfi1_fabric.fw) \
firmware(hfi1_pcie.fw) \
firmware(hfi1_sbus.fw) \
firmware(intel/ipu3-fw.bin) \
firmware(intel/irci_irci_ecr-master_20161208_0213_20170112_1500.bin) \
firmware(isci/isci_firmware.bin) \
firmware(qat_4xxx.bin) \
firmware(qat_4xxx_mmp.bin) \
firmware(qat_895xcc.bin) \
firmware(qat_895xcc_mmp.bin) \
firmware(qat_c3xxx.bin) \
firmware(qat_c3xxx_mmp.bin) \
firmware(qat_c62x.bin) \
firmware(qat_c62x_mmp.bin) \
firmware(qat_mmp.bin) \
kernel-firmware-intel"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
dracut"

inherit rpm
