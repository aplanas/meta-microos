SUMMARY = "Busybox applets replacing psmisc"
DESCRIPTION = "This package contains the symlinks to replace psmisc with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-psmisc-1.36.1-29.1.noarch.rpm"
RPM_HASH = "dc870f452f7aaec642832143b3fda4fd6506b479ba542268de0be7fe312d837d5de3f45d7e2697ef75d97504af5488a9f7bf7a39038f86280a8d21b5592b0752"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/fuser \
busybox-psmisc"

RDEPENDS:${PN} += "busybox"

inherit rpm
