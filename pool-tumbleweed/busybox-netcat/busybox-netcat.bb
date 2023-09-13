SUMMARY = "Busybox applets replacing netcat"
DESCRIPTION = "This package contains the symlinks to provide nc with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-netcat-1.36.1-30.1.noarch.rpm"
RPM_HASH = "397cd7e199ee3cf39da6df35c6040cadc219b6b9b7aa4e360a47fe7d5eb002f532edf9e1a66ff7bbfd149d9c68bbbd42f5ae3fd708dbce59c0d0e60e88916996"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-netcat"

RDEPENDS:${PN} += "busybox"

inherit rpm
