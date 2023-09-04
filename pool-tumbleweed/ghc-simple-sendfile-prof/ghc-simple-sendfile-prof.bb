SUMMARY = "Haskell simple-sendfile profiling library"
DESCRIPTION = "This package provides the Haskell simple-sendfile profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.32"

RPM_NAME = "ghc-simple-sendfile-prof-0.2.32-1.4.aarch64.rpm"
RPM_HASH = "36a8e9d3e21cd62e8ca86eb2e196512c865dfe467e7cc0788b62be3ca6200e04f1d571a40fd34254abfe33bc46aa65650b7c2ec4e588cc5484061215112dfec2"

RPROVIDES:${PN} += "ghc-prof-simple-sendfile-0.2.32-Jkz6BAomm8GAcovJHWebTs \
ghc-simple-sendfile-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-prof-unix-2.7.3 \
ghc-simple-sendfile-devel"

inherit rpm
