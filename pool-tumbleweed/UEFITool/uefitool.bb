SUMMARY = "Tools to inspect and work on UEFI BIOSes"
DESCRIPTION = "UEFITool is a C++/Qt program for parsing, extracting and \
modifying UEFI firmware images. It supports parsing of full BIOS images \
starting with the flash descriptor or any binary files containing UEFI \
volumes."
LICENSE = "BSD-2-Clause"

PV = "20201122"

RPM_NAME = "UEFITool-20201122-1.14.aarch64.rpm"
RPM_HASH = "e74161400ec49ce76aa4bffc7dbe627483363f362215476e3c2741a9cac46642d5d37cc1f3cab201308a473a88e682f118ca89612f552988517f0d7a6039e501"

RPROVIDES:${PN} += "UEFITool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
