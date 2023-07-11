SUMMARY = "Development files for libeconf"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that needs to read configuration files from \
different locations."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.2"

RPM_NAME = "libeconf-devel-0.5.2-1.4.aarch64.rpm"
RPM_HASH = "735cdf012884fe5d1ca11871f10cd49191092319319b8b44d1df20af2029d18c99a050d303482a8a7b0eb29472507a4c94863b00689339e44b256a139f557426"

RPROVIDES:${PN} += "libeconf-devel \
pkgconfig-libeconf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libeconf0"

inherit rpm
