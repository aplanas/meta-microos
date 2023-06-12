SUMMARY = "Conversion between documentation formats"
DESCRIPTION = "Pandoc-cli provides a command-line executable that uses the pandoc library to \
convert between markup formats."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.1"

RPM_NAME = "pandoc-cli-0.1.1-2.2.aarch64.rpm"
RPM_HASH = "da403e5235f878752951e9742bf51c59235f98c628dba63951eaa4a54bac39eb1f68afbde276b2aca51885dc90714fc40957abef5c79e2bcd62d5b8e5fd4285a"

RPROVIDES:${PN} += "pandoc \
pandoc-cli \
pandoc-cli(aarch-64)"
RDEPENDS:${PN} += "ghc-pandoc \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatomic.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libffi.so.8()(64bit) \
libffi.so.8(LIBFFI_BASE_8.0)(64bit) \
libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libnuma.so.1()(64bit) \
libnuma.so.1(libnuma_1.1)(64bit) \
libnuma.so.1(libnuma_1.2)(64bit) \
libyaml-0.so.2()(64bit) \
libz.so.1()(64bit)"

inherit rpm