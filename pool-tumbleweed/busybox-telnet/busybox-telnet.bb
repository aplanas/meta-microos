SUMMARY = "Busybox applets replacing telnet"
DESCRIPTION = "This package contains the symlinks to provide telnet with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-telnet-1.36.1-29.1.noarch.rpm"
RPM_HASH = "b62f27a8887cbd4b3b5e5640489f94c1adc606064153280d8ed6a6f9cbc2ebf1addfbfcb20637f915825838d616009ab10b5ce9f7dc2ee9c51ed712545286591"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-telnet"

RDEPENDS:${PN} += "busybox"

inherit rpm
