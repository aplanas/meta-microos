SUMMARY = "Busybox applets replacing time"
DESCRIPTION = "This package contains the symlinks to provide time with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-time-1.36.1-30.1.noarch.rpm"
RPM_HASH = "895ab4ca8a2fadc50b4b67570a7d77ae0aee03177b915d1c8db332d4287fd2606b3a0c054668000402e0e70c28850434211bf8d219ba5f4d12ebf0876705e584"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-time"

RDEPENDS:${PN} += "busybox"

inherit rpm
