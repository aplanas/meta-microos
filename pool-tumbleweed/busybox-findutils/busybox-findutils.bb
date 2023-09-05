SUMMARY = "Busybox applets replacing findutils"
DESCRIPTION = "This package contains the symlinks to replace findutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-findutils-1.36.1-29.1.noarch.rpm"
RPM_HASH = "1e2c49587a531c26c7b411163f1e5e3fbcc447abb68169626ed254db6aa8cfb5a672f7406d3eab2a6fa5fb176c5dfcf3a8763e1fc3c646711f08381c2a38c11d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-findutils"

RDEPENDS:${PN} += "busybox"

inherit rpm
