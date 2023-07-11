SUMMARY = "Busybox applets replacing procps"
DESCRIPTION = "This package contains the symlinks to replace procps with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-procps-1.36.1-27.1.noarch.rpm"
RPM_HASH = "e8fb0ca1cce48b735a9860c4c6fad5b9c686bca3a496d3cfaf705e7f150a5b433ccdae71a91d67e14c6168c9393a3e03bf99b9592d754c89fad1df2fc670cd56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/ps \
busybox-procps"

RDEPENDS:${PN} += "busybox"

inherit rpm
