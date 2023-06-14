SUMMARY = "Development Files for the Breeze Qt Quick Controls 2 Style"
DESCRIPTION = "This file contains cmake files to be used by projects that depend on \
qqc2-breeze-style. \
Usually not needed as it is only a runtime dependency."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.27.5"

RPM_NAME = "qqc2-breeze-style-devel-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "c69dd383993489d1630de33fc0babf2e93dd3da427f41e6870f26eeef01f5f299db72750b6c9ad5ed2c028bdde310207f7781c1773f783af4969da6d61f9a151"

RPROVIDES:${PN} += "cmake-KF5QQC2BreezeStyle \
qqc2-breeze-style-devel"

RDEPENDS:${PN} += "extra-cmake-modules \
qqc2-breeze-style"

inherit rpm
