SUMMARY = "Support for embedding GCC inside programs and libraries"
DESCRIPTION = "Package contains header files and documentation for GCC JIT front-end."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "libgccjit0-devel-gcc13-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "03657cc97511b488c2ec9dd5630fb525e37b2f3039a13122d771076739a7f31d3e1b2e1ef00dc3ddafb039731225d9a5b4fd9f66cb54afbb25d23e8739f8f29a"

RPROVIDES:${PN} += "libgccjit0-devel \
libgccjit0-devel-gcc13"

RDEPENDS:${PN} += "libgccjit0"

inherit rpm
