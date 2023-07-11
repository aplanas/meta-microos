SUMMARY = "Development files for libstilview"
DESCRIPTION = "This package contains headers and libraries required to build applications that \
use libstilview."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.2"

RPM_NAME = "libstilview-devel-2.4.2-2.2.aarch64.rpm"
RPM_HASH = "ba16d488a09ab4db25fd64799beb7a5732f12e8971ae691b6ea55429a3bcef2de5833e92ee18049872bdafae2c44145b40a80c104f1434c6bc05d4e7b890f225"

RPROVIDES:${PN} += "libstilview-devel \
pkgconfig-libstilview"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstilview0"

inherit rpm
