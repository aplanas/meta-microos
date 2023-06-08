SUMMARY = "Generic helper tool to build app in a distributable format"
DESCRIPTION = "Generic helper tool to build app in a distributable formats. \
Used by electron-builder but applicable not only for building Electron applications."
LICENSE = "MIT"

PV = "3.4.2^20220309g4e2aa6a1"

RPM_NAME = "app-builder-3.4.2^20220309g4e2aa6a1-1.5.aarch64.rpm"
RPM_HASH = "db434f6fe633f45d1cb5b5434e76e60380f3bb30a75d371f01b3a5a592321ff8eb0706cbeab54a4064298b80fb2b6668608ceb9e28ea4ce02d115aba9bbf2f07"

RPROVIDES:${PN} += "app-builder app-builder(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
