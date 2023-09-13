SUMMARY = "Busybox applets replacing which"
DESCRIPTION = "This package contains the symlinks to replace which with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-which-1.36.1-30.1.noarch.rpm"
RPM_HASH = "e7c14cdbc24c82ab1fa21d6fe0401943cc0425cfb609fc7c735c00e39c3e29b97248f576ac3fd647d3fe4378e5cdedfb582b3352bda0518c5c684672f1a290ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-which"

RDEPENDS:${PN} += "busybox"

inherit rpm
