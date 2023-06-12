SUMMARY = "Firmware dump utility"
DESCRIPTION = "An utility to automatically dump firmware dumps to /var/log/."
LICENSE = "GPL-2.0-only"

PV = "1"

RPM_NAME = "iwlfwdump-1-1.1.noarch.rpm"
RPM_HASH = "8bbe8ba0dc2b5650cc3667be1952a8495cd9e7f0029da706b7123d4ba52fee731c43b8200cb8c91bcb269f5ea655327330c0a27fba9293befa9c7a1638cd9d14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iwlfwdump"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm
