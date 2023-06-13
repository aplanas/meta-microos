SUMMARY = "Busybox applets replacing policycoreutils"
DESCRIPTION = "This package contains the symlinks to provide policycoreutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-policycoreutils-1.36.0-26.3.noarch.rpm"
RPM_HASH = "1b41aea530a60548e985ade5abf6a73b306379502849fc780b938f642427f6b11ebe305323d99d90279d7de7732f636abe15d4b860aa6146ecd5bee754f753e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-policycoreutils"

RDEPENDS:${PN} += "busybox"

inherit rpm
