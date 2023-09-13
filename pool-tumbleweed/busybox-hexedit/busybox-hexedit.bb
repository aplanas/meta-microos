SUMMARY = "Busybox applets replacing hexedit"
DESCRIPTION = "This package contains the symlinks to replace hexedit with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-hexedit-1.36.1-30.1.noarch.rpm"
RPM_HASH = "3e8304f336ed65a332c98a6977d7b32dbee8f1f40a62c6ecf18ed3296a42097b80bd66aae6937a5c653dc5b270ad2de9bab5bf5c4e460dedd1761393801152e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-hexedit"

RDEPENDS:${PN} += "busybox"

inherit rpm
