SUMMARY = "Busybox applets not fitting anywhere else"
DESCRIPTION = "This package contains the symlinks to provide various busybox applets which \
do not fit really to any other package."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-misc-1.36.1-27.1.noarch.rpm"
RPM_HASH = "34583b4351bb5bc57298c15ea2131354624b962a32c7cdb796502caff25a5663e029970207ec773462e295d97d51b2a15d5e210d299d7015962b71c0563fcff2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-misc"

RDEPENDS:${PN} += "busybox"

inherit rpm
