SUMMARY = "Kernel firmware files for Intel-platform device drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Intel-platform device drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230814"

RPM_NAME = "kernel-firmware-intel-20230814-1.1.noarch.rpm"
RPM_HASH = "e9e62c7d23f78371856971b793ecd15251a6a3fa5527f7f328d11f3554408db83c70bccddd5992d6184d9dba2b89e3c24717511bc8f83760dd2b914623e90146"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-hfi1-dc8051.fw \
firmware-hfi1-fabric.fw \
firmware-hfi1-pcie.fw \
firmware-hfi1-sbus.fw \
firmware-intel/ipu3-fw.bin \
firmware-intel/irci-irci-ecr-master-20161208-0213-20170112-1500.bin \
firmware-isci/isci-firmware.bin \
firmware-qat-4xxx-mmp.bin \
firmware-qat-4xxx.bin \
firmware-qat-895xcc-mmp.bin \
firmware-qat-895xcc.bin \
firmware-qat-c3xxx-mmp.bin \
firmware-qat-c3xxx.bin \
firmware-qat-c62x-mmp.bin \
firmware-qat-c62x.bin \
firmware-qat-mmp.bin \
kernel-firmware-intel"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
