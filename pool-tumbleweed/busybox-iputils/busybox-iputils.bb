SUMMARY = "Busybox applets replacing iputils"
DESCRIPTION = "This package contains the symlinks to replace iputils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-iputils-1.36.1-30.1.noarch.rpm"
RPM_HASH = "81a3a95348dbe6ea30af125dc053ad48b79cb4011a4c6a92ae704d4ff9ca379c6df493928aded8082953b80b0d0a36929aadd4484267b6224480e981e72da7ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/ping \
busybox-iputils"

RDEPENDS:${PN} += "busybox"

inherit rpm
