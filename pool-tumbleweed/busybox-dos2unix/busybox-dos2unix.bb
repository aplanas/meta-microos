SUMMARY = "Busybox applets replacing dos2unix"
DESCRIPTION = "This package contains the symlinks to provide dos2unix with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-dos2unix-1.36.0-26.3.noarch.rpm"
RPM_HASH = "2c3cb9d144ce3e231d3bd22ca004e77891a336973606fa1f7cab336e11f6fe9ded1577c7f934f42f75407b1cfe8276ded9ee14c66f5bd0b9739d6a561f979cd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-dos2unix"

RDEPENDS:${PN} += "busybox"

inherit rpm
