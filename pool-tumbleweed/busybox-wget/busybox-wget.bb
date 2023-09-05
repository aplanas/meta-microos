SUMMARY = "Busybox applets replacing wget"
DESCRIPTION = "This package contains the symlinks to replace wget with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-wget-1.36.1-29.1.noarch.rpm"
RPM_HASH = "62c6d8c361c616fcae0757d2762e4dd897205e42531794b6e8dd3c2df77d540a6c8b8ea8c17df3ee5ead0adc521e5b8cc8ff58316023a65df8f2bf71d58c8cb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-wget"

RDEPENDS:${PN} += "busybox"

inherit rpm
