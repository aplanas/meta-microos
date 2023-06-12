SUMMARY = "Tools for CramFs (Compressed ROM File System)"
DESCRIPTION = "This package contains tools that let you construct a CramFs \
(Compressed ROM File System) image from the contents of a given \
directory, as well as checking a constructed CramFs image and \
extracting its contents."
LICENSE = "GPL-2.0-only"

PV = "2.1"

RPM_NAME = "cramfs-tools-2.1-1.12.aarch64.rpm"
RPM_HASH = "1d2b69f42f8b0dda076fb9fa6168fd86b6e7b1c0ff7d73c0bdf1b12de349c21b5aac9d26c6cc0676482ea765619648bf15ec629c18665cf16523d3a5e03b0386"

RPROVIDES:${PN} += "cramfs-tools \
cramfs-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libz.so.1()(64bit)"

inherit rpm
