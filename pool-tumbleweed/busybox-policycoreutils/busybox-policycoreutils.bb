SUMMARY = "Busybox applets replacing policycoreutils"
DESCRIPTION = "This package contains the symlinks to provide policycoreutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-policycoreutils-1.36.1-28.1.noarch.rpm"
RPM_HASH = "244a932452fbe4ee3ea69618ecae9c7d2b4a6e2c56c01ae1ba71d2b250eb21882b93b668290e39313b31da903cbbb34fabbec95dcadcaac33b41a836c6fcfc10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-policycoreutils"

RDEPENDS:${PN} += "busybox"

inherit rpm
