SUMMARY = "Support for embedding GCC inside programs and libraries"
DESCRIPTION = "Package contains header files and documentation for GCC JIT front-end."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "libgccjit0-devel-gcc13-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "4b25e8efeff9f5e4dc374c75fb45f9d3bf450dd1c43749aee2504dca3b222f893e2b1a50e5eda2f4bffae95883300f9a84f65dcb903eb54e3b040c8736e3dd04"

RPROVIDES:${PN} += "libgccjit0-devel \
libgccjit0-devel-gcc13"

RDEPENDS:${PN} += "libgccjit0"

inherit rpm
