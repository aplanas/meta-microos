SUMMARY = "Development files for libeconf"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that needs to read configuration files from \
different locations."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.2"

RPM_NAME = "libeconf-devel-0.5.2-1.1.aarch64.rpm"
RPM_HASH = "53673748afdb34f43f877dd9de0ee20ca99c4e57689d7d9bb851e917e012d263cbb086317c4d4e87cc2e10d7b5a7000a6d8e5d0ad4506fb98e0b4c8ffad3f79d"

RPROVIDES:${PN} += "libeconf-devel \
pkgconfig-libeconf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libeconf0"

inherit rpm
