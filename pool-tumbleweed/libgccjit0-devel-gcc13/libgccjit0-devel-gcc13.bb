SUMMARY = "Support for embedding GCC inside programs and libraries"
DESCRIPTION = "Package contains header files and documentation for GCC JIT front-end."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "libgccjit0-devel-gcc13-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "6385300e4c344238f6716735795c87e679d0a0d46d0a69322e3fcc91f1336a3a24ada3e1a7ee255fffe69d77750531e6535528c05c230e84b2d86a42ac0dd05e"

RPROVIDES:${PN} += "libgccjit0-devel \
libgccjit0-devel-gcc13"

RDEPENDS:${PN} += "libgccjit0"

inherit rpm
