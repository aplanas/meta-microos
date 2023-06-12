SUMMARY = "Development files for cmark library"
DESCRIPTION = "This package provides the development files for cmark."
LICENSE = "BSD-2-Clause & MIT & CC-BY-SA-4.0"

PV = "0.30.3"

RPM_NAME = "cmark-devel-0.30.3-1.2.aarch64.rpm"
RPM_HASH = "5324d5cf84548e9ba6c4b4ee7223f16d0f244f3f14361a0f09e2af4d836158d05395bd07c5f6e386fd0ad84ceed6cac340241359fefa952e6a37289329e84ce5"

RPROVIDES:${PN} += "cmake(cmark) \
cmark-devel \
cmark-devel(aarch-64) \
pkgconfig(libcmark)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmark \
libcmark0_30_3"

inherit rpm
