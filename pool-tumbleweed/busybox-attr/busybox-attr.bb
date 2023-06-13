SUMMARY = "Busybox applets replacing attr"
DESCRIPTION = "This package contains the symlinks to replace attr with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-attr-1.36.0-26.3.noarch.rpm"
RPM_HASH = "d01f8fd7fc8bcab837852f73606d7c763561683d399337c91821d69f34e9cd08469d2e0beaca5475245fa99b8b9dd9ae1f780f8e10225a3579c702d2349b00c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-attr"

RDEPENDS:${PN} += "busybox"

inherit rpm
