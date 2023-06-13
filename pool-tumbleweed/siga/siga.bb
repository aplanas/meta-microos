SUMMARY = "System Information GAthering"
DESCRIPTION = "SIGA stands for System Information GAthering. It collects various \
system information and outputs it in HTML or ASCII format. Since it \
needs root permissions, you will be asked for the root password. It is \
very handy as an information source during installation support phone \
calls."
LICENSE = "GPL-2.0+"

PV = "12.101"

RPM_NAME = "siga-12.101-9.16.noarch.rpm"
RPM_HASH = "765e53a52ebf9f3a3652497235031cae2f1b664f83b4cbcae45ff3686400e5ad3e1bde0dcd87e95ed6973ae4a60da999cfe54b8b7907af0f7040d11a19862e65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "siga"

RDEPENDS:${PN} += "/bin/sh \
w3m"

inherit rpm
