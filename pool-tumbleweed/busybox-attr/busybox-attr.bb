SUMMARY = "Busybox applets replacing attr"
DESCRIPTION = "This package contains the symlinks to replace attr with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-attr-1.36.1-27.1.noarch.rpm"
RPM_HASH = "eea4b74bab1c4613e5fc93b752a45331ff4a3f032d63e110995c6a8edd767101072f9ac6bd42fea592d11f958ddbcbf4c75c0e805391b0d456c36a6466df0cda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-attr"

RDEPENDS:${PN} += "busybox"

inherit rpm
