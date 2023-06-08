SUMMARY = "Generate command-line completions using a simple DSL"
DESCRIPTION = " \
Generate tab completion for any shell command by specifying its usage in a familiar manpage-like format."
LICENSE = "MIT"

PV = "1.0+git.20220402.ec8fccc"

RPM_NAME = "compleat-1.0+git.20220402.ec8fccc-1.8.aarch64.rpm"
RPM_HASH = "f5dac92c91e571de3edf1e6802e6ff00ed9a974a6df548dfb1cdc021ec62f54772d3d39238ba48b29f218ac8e992d9bc968cbd486d3fb76759797f24e4e311f0"

RPROVIDES:${PN} += "compleat compleat(aarch-64)"
RDEPENDS:${PN} += "libatomic.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libffi.so.8()(64bit) libffi.so.8(LIBFFI_BASE_8.0)(64bit) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libnuma.so.1()(64bit) libnuma.so.1(libnuma_1.1)(64bit) libnuma.so.1(libnuma_1.2)(64bit)"

inherit rpm
