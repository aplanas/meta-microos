SUMMARY = "HTCondor's VM Gahp"
DESCRIPTION = "The condor_vm-gahp enables the Virtual Machine Universe feature of \
HTCondor. The VM Universe uses libvirt to start and control VMs under \
HTCondor's Startd."
LICENSE = "Apache-2.0"

PV = "9.0.16"

RPM_NAME = "htcondor-vm-gahp-9.0.16-1.3.aarch64.rpm"
RPM_HASH = "2149c7f33577f87b5e6ded98d3b20dcd8a0ddd6bbb44b75dfe77512fd8b18d32d03a729fecb77cb8043262fb16f54ef084c6581439bf8e4ac7391e042d513640"

RPROVIDES:${PN} += "htcondor-vm-gahp \
htcondor-vm-gahp(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/awk \
htcondor \
htcondor-classads \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libclassad.so.15()(64bit) \
libcondor_utils_9_0_16.so()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libvirt \
libvirt.so.0()(64bit)"

inherit rpm
