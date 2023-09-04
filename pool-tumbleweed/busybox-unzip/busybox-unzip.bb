SUMMARY = "Busybox applets replacing unzip"
DESCRIPTION = "This package contains the symlinks to replace unzip with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-unzip-1.36.1-28.1.noarch.rpm"
RPM_HASH = "d8cc1786f535ca7b12e244f71fca0c4e94b4e7b0f4282235ebed810e8526b5f7cb92646dde7f1ec67aff0e5038e6683e201a88b23bb983525364fff73bf03af2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-unzip"

RDEPENDS:${PN} += "busybox"

inherit rpm
