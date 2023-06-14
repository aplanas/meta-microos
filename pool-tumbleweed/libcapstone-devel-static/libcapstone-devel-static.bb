SUMMARY = "Static library for capstone"
DESCRIPTION = "Statically linked libcapstone."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "libcapstone-devel-static-4.0.2-2.3.aarch64.rpm"
RPM_HASH = "abe5cca61643af1d7c15eacbff0b72454b46ca9fd83d3a61c933494737d52cbc0e0941b9fb6e2d1c6f7eb0b239f8d488f388b11af5d3a2a769856ea3bb6eafff"

RPROVIDES:${PN} += "libcapstone-devel-static"

RDEPENDS:${PN} += "libcapstone-devel"

inherit rpm
