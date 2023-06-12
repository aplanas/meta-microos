SUMMARY = "GPU selection for NVIDIA optimus using bbswitch"
DESCRIPTION = "GPU (nvidia/intel) selection for NVIDIA optimus laptops using bbswitch"
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-nvidia-prime-2.1.5-3.3.noarch.rpm"
RPM_HASH = "da9a7777494e6c18a4d287b4886b4eee8ea13388a9113fdf0e9c02a696772e122b9338ab174d5c7d2cab7c616139a2bc55c94c76352911359ab0f0029246f675"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-nvidia-prime"
RDEPENDS:${PN} += "bumblebee-status \
suse-prime-bbswitch"

inherit rpm
