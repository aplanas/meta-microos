SUMMARY = "Support for embedding GCC inside programs and libraries"
DESCRIPTION = "Package contains header files and documentation for GCC JIT front-end."
LICENSE = "GPL-3.0-or-later"

PV = "13"

RPM_NAME = "libgccjit-devel-13-1.5.aarch64.rpm"
RPM_HASH = "36f8fb49a1e1987868b730c5a9bc9e3f086f4785759db6a4fcfe686da3db26dd55509b02dc79729ab8930e77a30dca4469668cff711233ac8c88a0e982718228"

RPROVIDES:${PN} += "libgccjit-devel"

RDEPENDS:${PN} += "libgccjit0-devel-gcc13"

inherit rpm
