SUMMARY = "The command-line interface for Cabal and Hackage"
DESCRIPTION = "The 'cabal' command-line program simplifies the process of managing Haskell \
software by automating the fetching, configuration, compilation and \
installation of Haskell libraries and programs."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "cabal-install-3.8.1.0-1.7.aarch64.rpm"
RPM_HASH = "c06a16a3567f4859ae1ba559d69b495a37d061ed5e0fcf7989aa302af11e220d34fc0106d826a3cb25e432134fc8250e3ab3c16c0e3b382251598fbd3b11c024"

RPROVIDES:${PN} += "cabal-install"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
libz.so.1"

inherit rpm
