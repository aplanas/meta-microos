SUMMARY = "Busybox applets replacing ed"
DESCRIPTION = "This package contains the symlinks to provide ed with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-ed-1.36.1-27.1.noarch.rpm"
RPM_HASH = "097c32c5c60f167bf552d90c015e36a98eb8695a1d7bb75b3460d0ae078b9beb2939c93995976532d4e7b0995fca0c812a5518dbcd81489cf65bcac6dfe4b11e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-ed"

RDEPENDS:${PN} += "busybox"

inherit rpm
