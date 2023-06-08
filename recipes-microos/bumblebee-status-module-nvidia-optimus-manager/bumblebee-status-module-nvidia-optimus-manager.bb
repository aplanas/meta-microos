SUMMARY = "GPU selection for NVIDIA optimus using optimus-manager"
DESCRIPTION = "GPU (nvidia/intel) selection for NVIDIA optimus laptops using optimus-manager."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-nvidia-optimus-manager-2.1.5-3.3.noarch.rpm"
RPM_HASH = "499b60413d9838f23622c746c450fc04c6babe0ecd4b8e315dd47cb63f13bb7ac6dac69dcbf749d938437c7bc9f910f9892462185176a9f7fef6543d2319eb10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-nvidia-optimus-manager"
RDEPENDS:${PN} += "bumblebee-status"

inherit rpm
