SUMMARY = "Support for embedding GCC inside programs and libraries"
DESCRIPTION = "Package contains header files and documentation for GCC JIT front-end."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "libgccjit0-devel-gcc13-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "8cdc8f8128f34ccf162ab8f0b30a4945e57492524395e6e8e4910d51409f6207a7d93e638697f6f67ae39ed2f95199909a7b2f092c88aecc946daafd57d92d47"

RPROVIDES:${PN} += "libgccjit0-devel \
libgccjit0-devel-gcc13"

RDEPENDS:${PN} += "libgccjit0"

inherit rpm
