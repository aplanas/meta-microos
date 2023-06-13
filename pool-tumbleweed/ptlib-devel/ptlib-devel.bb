SUMMARY = "Development files for ptlib (includes headers and scripts)"
DESCRIPTION = "This package includes header files and scripts needed for developers \
using the ptlib library."
LICENSE = "MPL-1.0"

PV = "2.18.8"

RPM_NAME = "ptlib-devel-2.18.8-1.5.aarch64.rpm"
RPM_HASH = "35f7d5cc0498a4135c128b0471bf76b7425912f89e1035d3f87a0f055536a0f272dc570c41a4df6d4fedec38f7d835adf6d40d166ac71f63d9b1decbd19a4d99"

RPROVIDES:${PN} += "libpt-devel \
libpt2-devel \
pkgconfig(ptlib) \
ptlib-devel \
ptlib-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpt2_18_8"

inherit rpm
