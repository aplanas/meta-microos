SUMMARY = "Development files for qrupdate library"
DESCRIPTION = "This package contains the development files for the qrupdate libraries."
LICENSE = "GPL-3.0+"

PV = "1.1.2"

RPM_NAME = "qrupdate-devel-1.1.2-3.32.aarch64.rpm"
RPM_HASH = "b111d7a151c15348e45aa4131ece7940fd86aa203b0638495754f9f1541b1ec5a7b46276579f19966cd2604d8b953804c34b29f8e4593cea36a9a392e4790864"

RPROVIDES:${PN} += "qrupdate-devel"

RDEPENDS:${PN} += "libqrupdate1"

inherit rpm
