SUMMARY = "Kernel firmware files for Intel-platform device drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Intel-platform device drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230620"

RPM_NAME = "kernel-firmware-intel-20230620-1.1.noarch.rpm"
RPM_HASH = "f066bc69a6562be53d4880b77d560dc9e30e4480b65539ad80335d217069adcf83d5b06c6b65857c5108efaa82e74c6c538b402852715935139f33b0f585fa5d"
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
