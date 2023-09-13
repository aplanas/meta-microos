SUMMARY = "Busybox applets replacing diffutils"
DESCRIPTION = "This package contains the symlinks to replace diffutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-diffutils-1.36.1-30.1.noarch.rpm"
RPM_HASH = "a4f36f0ea665240827153ddf53b8e04af488a8a172b26b384058852a1aba42236db90b2e8f3ffa4d9a85e0a4621fd4af29d26320477693476806b807f5e7c000"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-diffutils"

RDEPENDS:${PN} += "busybox"

inherit rpm
