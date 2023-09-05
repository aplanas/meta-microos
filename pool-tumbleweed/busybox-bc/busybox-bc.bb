SUMMARY = "Busybox applets replacing bc"
DESCRIPTION = "This package contains the symlinks to provide bc with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-bc-1.36.1-29.1.noarch.rpm"
RPM_HASH = "9f3d3c12932994f4e4a8a434135d2c1b22ae074b7efaccfa566d592a98a9c79b39a4c6c98ebedbd1d504c5f7d46a0487c0d5347044b05e943b2da576d232e882"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-bc"

RDEPENDS:${PN} += "busybox"

inherit rpm
