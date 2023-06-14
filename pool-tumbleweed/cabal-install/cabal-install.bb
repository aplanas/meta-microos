SUMMARY = "The command-line interface for Cabal and Hackage"
DESCRIPTION = "The 'cabal' command-line program simplifies the process of managing Haskell \
software by automating the fetching, configuration, compilation and \
installation of Haskell libraries and programs."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "cabal-install-3.8.1.0-1.3.aarch64.rpm"
RPM_HASH = "e477ce6dc9429b6907350ff1d4affe93eb874738239f6952e5e536645b0d02b3f8ff89949ddf51544e39cf3bcaeba0074a7805b9bdabb8219d83fe480f309d4b"

RPROVIDES:${PN} += "cabal-install"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatomic.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
libz.so.1"

inherit rpm
