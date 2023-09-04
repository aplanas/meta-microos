SUMMARY = "Busybox applets replacing netcat"
DESCRIPTION = "This package contains the symlinks to provide nc with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-netcat-1.36.1-28.1.noarch.rpm"
RPM_HASH = "fd5288280abc27d7f83139e08e91a370465ff7b86851443373388265408d7ef86f360941924f1b32b3c4852159971a96d11feb4319afeee76cee21da63cfd48a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-netcat"

RDEPENDS:${PN} += "busybox"

inherit rpm
