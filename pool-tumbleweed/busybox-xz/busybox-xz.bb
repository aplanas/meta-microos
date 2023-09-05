SUMMARY = "Busybox applets replacing xz"
DESCRIPTION = "This package contains the symlinks to replace xz with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-xz-1.36.1-29.1.noarch.rpm"
RPM_HASH = "281807e18ba0a7e81d03a0a3b240215811097d2e29d4725200970ad6c37fd68d9061e2f78f65a6b4a22f3a7c5f8ac33651df385900df53944417507a544cf722"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-xz"

RDEPENDS:${PN} += "busybox"

inherit rpm
