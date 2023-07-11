SUMMARY = "Busybox applets replacing gawk"
DESCRIPTION = "This package contains the symlinks to replace gawk with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-gawk-1.36.1-27.1.noarch.rpm"
RPM_HASH = "5a39225b3f9c2e9d4cd59f6742c367af20f1964dac70b73f79a6dfd2c803b9446e09e11267b10e1f5abc8a10584321f6ab182f9443ac7abea21fea62a0fbbc41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/awk \
busybox-gawk"

RDEPENDS:${PN} += "busybox"

inherit rpm
