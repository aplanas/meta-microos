SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libblkid-devel-static-2.39-3.1.aarch64.rpm"
RPM_HASH = "afd853191dd376c6e9b07672e04f436cbbfecd2ef361c70d0953605162b224919245c617947fd5b4092ea8f4d4233705e45027c9ff46890e94a6d3ff8e573823"

RPROVIDES:${PN} += "libblkid-devel-static"

RDEPENDS:${PN} += "libblkid-devel"

inherit rpm
