SUMMARY = "Busybox applets replacing policycoreutils"
DESCRIPTION = "This package contains the symlinks to provide policycoreutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-policycoreutils-1.36.1-29.1.noarch.rpm"
RPM_HASH = "91962aba58d465e3a9e13f84f30d6a7e6c07b09acb6cbaec0e3df9b6e7edd7716bc652173baa3fe5871869d72877c178efb010331665283d366f38b3367119be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-policycoreutils"

RDEPENDS:${PN} += "busybox"

inherit rpm
