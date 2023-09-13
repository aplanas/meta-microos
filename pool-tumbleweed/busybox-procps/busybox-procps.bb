SUMMARY = "Busybox applets replacing procps"
DESCRIPTION = "This package contains the symlinks to replace procps with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-procps-1.36.1-30.1.noarch.rpm"
RPM_HASH = "f74c647b5f293730c72a2fa07cd32f54c7036f9e5063d29cbfa5fabb67f53d2e0bb1ec4e1778d672fe8a0d6bc9321e5b5500b3cd272a0a3cd48b8df73d7abe14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/ps \
busybox-procps"

RDEPENDS:${PN} += "busybox"

inherit rpm
