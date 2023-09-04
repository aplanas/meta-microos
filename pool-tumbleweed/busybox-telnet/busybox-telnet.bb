SUMMARY = "Busybox applets replacing telnet"
DESCRIPTION = "This package contains the symlinks to provide telnet with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-telnet-1.36.1-28.1.noarch.rpm"
RPM_HASH = "1efa8f6a2f815cd81b0ccebc7a34f8744f197c10aebe1e3ebd649ab4e6298a335b4f98aa46680b8b3ba26c3b1f94b84f471eb4e642e305c6a36ccbb093b21f0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-telnet"

RDEPENDS:${PN} += "busybox"

inherit rpm
