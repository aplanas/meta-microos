SUMMARY = "Busybox applets replacing tftp"
DESCRIPTION = "This package contains the symlinks to provide tftp with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-tftp-1.36.0-26.3.noarch.rpm"
RPM_HASH = "33df653f354f96035280c9c92854f7fac2c5569c07e89ca87b3e1f5ec84af9e3cb32497a720a7cf996c9ed4bbd29e3f622febaf2477a20850ffd12d17b3def48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-tftp"

RDEPENDS:${PN} += "busybox"

inherit rpm
