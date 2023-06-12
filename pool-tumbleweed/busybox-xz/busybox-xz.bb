SUMMARY = "Busybox applets replacing xz"
DESCRIPTION = "This package contains the symlinks to replace xz with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-xz-1.36.0-26.3.noarch.rpm"
RPM_HASH = "353222bf22ca4509ac2e1fb3287aa5dac8d0ce58b489f54490248188fbb1d3b3f05e264f2570edbfc200d5db658ed2785cd67dd1188f2f42f889b1ec46fafec6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-xz"
RDEPENDS:${PN} += "busybox"

inherit rpm
