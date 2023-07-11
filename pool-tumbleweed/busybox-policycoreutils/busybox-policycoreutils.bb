SUMMARY = "Busybox applets replacing policycoreutils"
DESCRIPTION = "This package contains the symlinks to provide policycoreutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-policycoreutils-1.36.1-27.1.noarch.rpm"
RPM_HASH = "31c4b85f3111a0fc58844b7bf1ad6b354ddedf7d7ac060885fb8f3339fb793501f22f545b79b69aeb20b5ac6b94181fb5105ca2c0279c53591e0cf2081191e27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-policycoreutils"

RDEPENDS:${PN} += "busybox"

inherit rpm
