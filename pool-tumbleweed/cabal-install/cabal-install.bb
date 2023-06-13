SUMMARY = "The command-line interface for Cabal and Hackage"
DESCRIPTION = "The 'cabal' command-line program simplifies the process of managing Haskell \
software by automating the fetching, configuration, compilation and \
installation of Haskell libraries and programs."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "cabal-install-3.8.1.0-1.3.aarch64.rpm"
RPM_HASH = "e477ce6dc9429b6907350ff1d4affe93eb874738239f6952e5e536645b0d02b3f8ff89949ddf51544e39cf3bcaeba0074a7805b9bdabb8219d83fe480f309d4b"

RPROVIDES:${PN} += "cabal-install \
cabal-install(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
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
libz.so.1()(64bit)"

inherit rpm
