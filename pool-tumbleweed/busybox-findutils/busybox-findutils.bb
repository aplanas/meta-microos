SUMMARY = "Busybox applets replacing findutils"
DESCRIPTION = "This package contains the symlinks to replace findutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-findutils-1.36.0-26.3.noarch.rpm"
RPM_HASH = "7e22dfa149c0295352af57bdf19d48ab60346b50444010e46e4ed749363971f1a547f69453c164286723a7a74a07f985aed4a57a734132fad993fc2ddc7b30f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-findutils"

RDEPENDS:${PN} += "busybox"

inherit rpm
