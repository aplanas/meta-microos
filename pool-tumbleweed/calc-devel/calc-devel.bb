SUMMARY = "Development files for libcalc"
DESCRIPTION = "Part of the calc release consists of an arbitrary precision math link \
library.  This link library is used by the calc program to perform its \
own calculations.  If you wish, you can ignore the calc program entirely \
and call the arbitrary precision math routines from your own C programs. \
 \
This package contains the files needed for building programs that use \
this library."
LICENSE = "LGPL-2.1-only"

PV = "2.14.3.4"

RPM_NAME = "calc-devel-2.14.3.4-1.1.aarch64.rpm"
RPM_HASH = "b7e92e03ad3433e5f6b4d260cbb9ef1ea46383111bc304a3e72028986172cd5a5599829d6a109cfa6048b6d4c78158df9ec43c3f873f4cfd4c46dd7204acdc3f"

RPROVIDES:${PN} += "calc-devel"

RDEPENDS:${PN} += "libcalc2-14-3-4"

inherit rpm
