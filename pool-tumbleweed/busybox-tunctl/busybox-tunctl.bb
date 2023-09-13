SUMMARY = "Busybox applets replacing tunctl"
DESCRIPTION = "This package contains the symlinks to provide tunctl with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-tunctl-1.36.1-30.1.noarch.rpm"
RPM_HASH = "473b9197763e3f37a6a1c61ad41461790846cddded4bd76043dfb98921f3c409eec2f9fc9ed102adecdb1a49a22f331a0ef3acd8ac64495fa9d5cc85a6fa9e74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-tunctl"

RDEPENDS:${PN} += "busybox"

inherit rpm
