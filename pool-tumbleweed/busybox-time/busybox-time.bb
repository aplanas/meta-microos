SUMMARY = "Busybox applets replacing time"
DESCRIPTION = "This package contains the symlinks to provide time with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-time-1.36.1-27.1.noarch.rpm"
RPM_HASH = "5409d8dd3258befd105e52f7a72f6046e863806949762a8b8c9e37a93c4c61ea46246f0b347f8cd5c448bafb5d1ca7d6e90796196ee2c3c4dcc58ca6bbf6ccab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-time"

RDEPENDS:${PN} += "busybox"

inherit rpm
