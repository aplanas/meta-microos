SUMMARY = "Busybox applets replacing kbd"
DESCRIPTION = "This package contains the symlinks to replace kbd with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-kbd-1.36.0-26.3.noarch.rpm"
RPM_HASH = "c37d896c61dfd5c0e825877e89ec3670b739e2782543216cbdae7504cafd82cb6f113e8f6d09a1bcc88750467c2592ea88884173a99693ff87400b5d8bd4f231"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-kbd"
RDEPENDS:${PN} += "busybox"

inherit rpm
