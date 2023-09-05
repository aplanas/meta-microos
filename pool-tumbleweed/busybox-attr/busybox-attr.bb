SUMMARY = "Busybox applets replacing attr"
DESCRIPTION = "This package contains the symlinks to replace attr with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-attr-1.36.1-29.1.noarch.rpm"
RPM_HASH = "08039970853b30d1f8f55e10f2c559c3599424c1b0a0f3772680e2e103db4a64d7dbdbd79235c3917e9dda897347d2edca2487493e783e051512ab4fe77e3f53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-attr"

RDEPENDS:${PN} += "busybox"

inherit rpm
