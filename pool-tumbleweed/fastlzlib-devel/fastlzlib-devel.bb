SUMMARY = "Development files for the 'fastlzlib' compression library"
DESCRIPTION = "Header files for the fastlzlib library, a library that bundles and \
wraps LZ4 and FastLZ in a zlib-like interface."
LICENSE = "BSD-2-Clause"

PV = "0.0+git.20150524"

RPM_NAME = "fastlzlib-devel-0.0+git.20150524-2.19.aarch64.rpm"
RPM_HASH = "e19fd1b9e185b4865fa775a1d8f108c0ee367212efefc4b7772e7ac4d938163379214e6617e20a62c3772ae8c3f8229d0c21dcd270e24b08b8594a95fb00c6cb"

RPROVIDES:${PN} += "fastlzlib-devel \
fastlzlib-devel(aarch-64)"

RDEPENDS:${PN} += "libfastlz1"

inherit rpm
