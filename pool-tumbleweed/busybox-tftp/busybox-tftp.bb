SUMMARY = "Busybox applets replacing tftp"
DESCRIPTION = "This package contains the symlinks to provide tftp with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-tftp-1.36.1-27.1.noarch.rpm"
RPM_HASH = "29f40a038c487f54fbf5db91b01262d6d4ca8bd628784f78202b775bf7d74ed7c9345ef82b5c589b19016cb09e6bb91ffa982d4a5a5c7343aee49ee09bbb4b3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-tftp"

RDEPENDS:${PN} += "busybox"

inherit rpm
