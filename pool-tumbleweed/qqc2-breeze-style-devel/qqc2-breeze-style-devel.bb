SUMMARY = "Development Files for the Breeze Qt Quick Controls 2 Style"
DESCRIPTION = "This file contains cmake files to be used by projects that depend on \
qqc2-breeze-style. \
Usually not needed as it is only a runtime dependency."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.27.7"

RPM_NAME = "qqc2-breeze-style-devel-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "a2be946673f992929262ff48143af95136e9ade75b63af05969629d3a3a42cd38886d48d0ec58f49567bbe9b3b31480e1255fa9c34ce4383c9ae1640d0f8638b"

RPROVIDES:${PN} += "cmake-KF5QQC2BreezeStyle \
qqc2-breeze-style-devel"

RDEPENDS:${PN} += "extra-cmake-modules \
qqc2-breeze-style"

inherit rpm
