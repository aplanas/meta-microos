SUMMARY = "Busybox applets replacing iputils"
DESCRIPTION = "This package contains the symlinks to replace iputils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-iputils-1.36.1-28.1.noarch.rpm"
RPM_HASH = "a457277a94e68c8dbac63e37d2e6cac1b5fd41dc6fa02b42f8ddf38c2eba4f96b29082f4801bf3f1be173a1010f54a8c97c7e7e83b7a4ecb82958f8e9835ffaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/ping \
busybox-iputils"

RDEPENDS:${PN} += "busybox"

inherit rpm
