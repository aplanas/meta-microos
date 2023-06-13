SUMMARY = "Script to better monitor interrupts in large systems"
DESCRIPTION = "A better way to watch /proc/interrupts, designed for NUMA systems with many processors."
LICENSE = "MIT"

PV = "1.0.0+git4cd6854"

RPM_NAME = "irqstat-1.0.0+git4cd6854-1.7.noarch.rpm"
RPM_HASH = "8dddd894484f6dad0c632b80e7bb460f4e43ac48d84060048f132f3266b85c342e59d8fb31d0c9a8f9018cac1dae12683c5307193130cf4331a18d5c59fb56e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "irqstat"

RDEPENDS:${PN} += "/usr/bin/python3 \
numactl"

inherit rpm
