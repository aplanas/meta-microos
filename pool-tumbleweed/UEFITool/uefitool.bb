SUMMARY = "Tools to inspect and work on UEFI BIOSes"
DESCRIPTION = "UEFITool is a C++/Qt program for parsing, extracting and \
modifying UEFI firmware images. It supports parsing of full BIOS images \
starting with the flash descriptor or any binary files containing UEFI \
volumes."
LICENSE = "BSD-2-Clause"

PV = "20201122"

RPM_NAME = "UEFITool-20201122-1.13.aarch64.rpm"
RPM_HASH = "04e4a357ae707848087e30bb977b0b2727ddaff6ee22df377af27f15db8961cd8b2df9efa5de76b2d4057b1983a6ef7c26ac8f7bd74cfba193325670dd5fb8db"

RPROVIDES:${PN} += "UEFITool \
UEFITool(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
