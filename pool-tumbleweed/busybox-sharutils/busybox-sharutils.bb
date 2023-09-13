SUMMARY = "Busybox applets replacing sharutils"
DESCRIPTION = "This package contains the symlinks to replace sharutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-sharutils-1.36.1-30.1.noarch.rpm"
RPM_HASH = "c35b7184201c0e6582b25765c5e9b292b0a5497f07e914aae285b8c75fcc50e62a78a7f7711d7fca1a860f4a456d8763ce34a211aa0a0a489716b61ba3306add"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-sharutils"

RDEPENDS:${PN} += "busybox"

inherit rpm
