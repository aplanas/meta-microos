SUMMARY = "Haskell unix profiling library"
DESCRIPTION = "This package provides the Haskell unix profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.7.3"

RPM_NAME = "ghc-unix-prof-2.7.3-3.2.aarch64.rpm"
RPM_HASH = "793d8155effce367b4da0cae4576ab284ec923afa0414a878df73629c5fc984f577b15cb8bcc10c2bfb5adb7a27901621cc1d4e999c3a4ab1611ff86c6df4f0e"

RPROVIDES:${PN} += "ghc-prof-unix-2.7.3 \
ghc-unix-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-time-1.12.2 \
ghc-unix-devel"

inherit rpm
