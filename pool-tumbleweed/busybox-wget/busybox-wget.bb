SUMMARY = "Busybox applets replacing wget"
DESCRIPTION = "This package contains the symlinks to replace wget with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-wget-1.36.1-27.1.noarch.rpm"
RPM_HASH = "c08285cfaec3ed77f7eef7c4816361fc72237d6a2a213413bd83efbadb8acd2a07d6dab18de22d74488e6297ed99730aec56b5621a13268278606d9271813bae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-wget"

RDEPENDS:${PN} += "busybox"

inherit rpm
