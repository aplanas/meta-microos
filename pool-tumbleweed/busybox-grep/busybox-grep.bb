SUMMARY = "Busybox applets replacing grep"
DESCRIPTION = "This package contains the symlinks to replace grep with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-grep-1.36.0-26.3.noarch.rpm"
RPM_HASH = "69272405576915531deab56a1024511e2f8592d5b0d26d5e2e70fb7c609c90857bb66cbc54f6ee85554282c7e3ecb2c5c36ab3c4fa6d7eb4c0af41804a8bccb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/grep \
busybox-grep"

RDEPENDS:${PN} += "busybox"

inherit rpm
