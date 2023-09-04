SUMMARY = "Busybox applets replacing grep"
DESCRIPTION = "This package contains the symlinks to replace grep with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-grep-1.36.1-28.1.noarch.rpm"
RPM_HASH = "2be8b4bd591ad1e6bccbfe35a533ec2918f873e99b73a3248bbd3d97412c4e252e0d754da7eb52a5d42e9879b2070d83ba5406ae08efbe4e0b3dfe5cc366468d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/grep \
busybox-grep"

RDEPENDS:${PN} += "busybox"

inherit rpm
