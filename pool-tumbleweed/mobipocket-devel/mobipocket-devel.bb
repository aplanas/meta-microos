SUMMARY = "E-book plugin and library"
DESCRIPTION = "Mobipocket E-book plugin and library. \
 \
This package provides development files for mobipocket \
library"
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "mobipocket-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "a0b862d085807b209d11d1a7640c7ceb29519571efce1c0a5d867d4a2ebf726ac6402fbe31052f963fbf755290ec3b9399167518a433eaec5bb90c6f713f3106"

RPROVIDES:${PN} += "cmake-QMobipocket \
mobipocket-devel"

RDEPENDS:${PN} += "libqmobipocket2"

inherit rpm
