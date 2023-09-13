SUMMARY = "Busybox applets replacing psmisc"
DESCRIPTION = "This package contains the symlinks to replace psmisc with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-psmisc-1.36.1-30.1.noarch.rpm"
RPM_HASH = "c08c76fd989939500818412caf5c4ac5ae73c641e1b266af0b8c52171b33f63e7ede194f36359ae4b7ad37db2513eb7b98b81e4e959aaf800da1880cfca6e83b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/fuser \
busybox-psmisc"

RDEPENDS:${PN} += "busybox"

inherit rpm
