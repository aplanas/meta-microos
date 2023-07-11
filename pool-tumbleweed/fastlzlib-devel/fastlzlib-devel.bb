SUMMARY = "Development files for the 'fastlzlib' compression library"
DESCRIPTION = "Header files for the fastlzlib library, a library that bundles and \
wraps LZ4 and FastLZ in a zlib-like interface."
LICENSE = "BSD-2-Clause"

PV = "0.0+git.20150524"

RPM_NAME = "fastlzlib-devel-0.0+git.20150524-2.20.aarch64.rpm"
RPM_HASH = "bb52313da8dc96b3066779d3cf0c2b56d874486af3bc4667fc8e9339b92f75374fe55829b033dae4f271d98fd58731aac83dbf0c672a9a97bcb9d7406631a6a3"

RPROVIDES:${PN} += "fastlzlib-devel"

RDEPENDS:${PN} += "libfastlz1"

inherit rpm
