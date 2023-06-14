SUMMARY = "Development library to encode performance events for perf_events interface"
DESCRIPTION = "This package provides development libraries and header files used to encode performance events for perf_events interface."
LICENSE = "MIT"

PV = "4.13.0"

RPM_NAME = "libpfm-devel-4.13.0-1.1.aarch64.rpm"
RPM_HASH = "8aab1199f8709bae3fa44b17eb51395a53bcdf5276035350124fd7c43908a2d4be2428128b31fe754f2765e0ff34001e03902bfbde463938cff5ea2780aeaf78"

RPROVIDES:${PN} += "libpfm-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpfm4"

inherit rpm
