SUMMARY = "Development files for cmark library"
DESCRIPTION = "This package provides the development files for cmark."
LICENSE = "BSD-2-Clause & MIT & CC-BY-SA-4.0"

PV = "0.30.3"

RPM_NAME = "cmark-devel-0.30.3-1.3.aarch64.rpm"
RPM_HASH = "528338fbf88c1147d4323228f0841a73eb98355233e1a4a683b23991c07940a07fb87a9869243c9c3bc1e804581db41a4c3c28578536f53765ba4917ec84fc28"

RPROVIDES:${PN} += "cmake-cmark \
cmark-devel \
pkgconfig-libcmark"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmark \
libcmark0-30-3"

inherit rpm
