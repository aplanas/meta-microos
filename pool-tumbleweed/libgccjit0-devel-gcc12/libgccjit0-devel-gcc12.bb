SUMMARY = "Support for embedding GCC inside programs and libraries"
DESCRIPTION = "Package contains header files and documentation for GCC JIT front-end."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "libgccjit0-devel-gcc12-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "d5edf7219425cd5940e5d715fc1ed21e998c6e1b53b04eaec8fdd46bae5b7b7091c6cf64185bc012258a5be92b885ca2243495085c80664afcb52469a48726ef"

RPROVIDES:${PN} += "libgccjit0-devel \
libgccjit0-devel-gcc12"

RDEPENDS:${PN} += "libgccjit0-gcc12"

inherit rpm
