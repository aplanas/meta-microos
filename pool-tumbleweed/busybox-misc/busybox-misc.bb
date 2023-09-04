SUMMARY = "Busybox applets not fitting anywhere else"
DESCRIPTION = "This package contains the symlinks to provide various busybox applets which \
do not fit really to any other package."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-misc-1.36.1-28.1.noarch.rpm"
RPM_HASH = "a83dbf3b2ea955b2faa635cb5ebc8e761e56641fc83569831af1caa6e0f498b840960bf976c16d81a33615040baf14d47d29ae33fa7e4a5ebd666b0fdb90352f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-misc"

RDEPENDS:${PN} += "busybox"

inherit rpm
