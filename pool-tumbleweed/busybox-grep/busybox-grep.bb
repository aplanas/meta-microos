SUMMARY = "Busybox applets replacing grep"
DESCRIPTION = "This package contains the symlinks to replace grep with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-grep-1.36.1-30.1.noarch.rpm"
RPM_HASH = "a27bf45a9416235ae99ca3e3ee9d43a86b61b442bbeb37c0b1961242ea26d991203ec6af2a8f0f4a0d87119e7af6f641832a01104f1cd8408a773e7f30efa1fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/grep \
busybox-grep"

RDEPENDS:${PN} += "busybox"

inherit rpm
