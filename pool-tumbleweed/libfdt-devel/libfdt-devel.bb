SUMMARY = "Development headers for device tree library"
DESCRIPTION = "This package provides development files for libfdt"
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libfdt-devel-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "885e69cc3ff844bab9bf87705af1ee1dc111025a8beb93e11bf698313332241a868c7725c071e0fddb29057eb2f6fb3a2887ee61c97efc89477825424d6ab640"

RPROVIDES:${PN} += "libfdt-devel \
libfdt1-devel"

RDEPENDS:${PN} += "libfdt1"

inherit rpm
