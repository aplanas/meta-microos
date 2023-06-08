SUMMARY = "Displays count of running libvirt VMs"
DESCRIPTION = "Displays count of running libvirt VMs."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-libvirt-2.1.5-3.3.noarch.rpm"
RPM_HASH = "7cf7961a05bc441557625e6c62dbe11f74e8385767b233127cc33d86b98d28a3b46a5adb404967457defaef8506b5aa9f0658a45b401c969bc5a38dd1bd8017d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-libvirt"
RDEPENDS:${PN} += "bumblebee-status python3-libvirt-python virt-manager"

inherit rpm
