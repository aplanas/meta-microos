SUMMARY = "Busybox applets replacing tftp"
DESCRIPTION = "This package contains the symlinks to provide tftp with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-tftp-1.36.1-28.1.noarch.rpm"
RPM_HASH = "76e9a906e25ad271a9e79982acd6eaf31a93aa6f6859c96b192216d7cb69f32ec7e684dfe0d8432d53041b5c63da7772fd7f984e20a74e88f805dc07d605ae9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-tftp"

RDEPENDS:${PN} += "busybox"

inherit rpm
