SUMMARY = "Files for Developing with libnumbertext"
DESCRIPTION = "Language-neutral NUMBERTEXT and MONEYTEXT functions for LibreOffice Calc \
 \
This package contains the libnumbertext development files."
LICENSE = "MPL-2.0"

PV = "1.0.11"

RPM_NAME = "libnumbertext-devel-1.0.11-1.3.aarch64.rpm"
RPM_HASH = "fa1d40c756b2030dbaf150ef98a32984149b1c480948d0a2c27c5f97b491381b2487dec978ca85ced108bf7f2e8ce879bc344e5ae7d79df48892ae06177042a8"

RPROVIDES:${PN} += "libnumbertext-devel \
pkgconfig-libnumbertext"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnumbertext-1-0-0"

inherit rpm
