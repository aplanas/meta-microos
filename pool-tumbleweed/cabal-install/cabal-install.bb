SUMMARY = "The command-line interface for Cabal and Hackage"
DESCRIPTION = "The 'cabal' command-line program simplifies the process of managing Haskell \
software by automating the fetching, configuration, compilation and \
installation of Haskell libraries and programs."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "cabal-install-3.8.1.0-2.4.aarch64.rpm"
RPM_HASH = "5ffe5a5433c95678e71f8a26d2351799c58aa1178c841b2087b50a0c0b634f2c14473a76b05baa5c6c5923b7e44bbf91ef880bbbb2cd1bcad8965089916a56fd"

RPROVIDES:${PN} += "cabal-install"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
libz.so.1"

inherit rpm
