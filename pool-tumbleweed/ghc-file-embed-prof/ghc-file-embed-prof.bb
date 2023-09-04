SUMMARY = "Haskell file-embed profiling library"
DESCRIPTION = "This package provides the Haskell file-embed profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.0.15.0"

RPM_NAME = "ghc-file-embed-prof-0.0.15.0-2.3.aarch64.rpm"
RPM_HASH = "36c7c2111dabb65c0f48a0cc3989372d514a4e54866a7b507560374fde43f9b25897d5c6aacc6756206532abe050c5cc8656ec495067eaf259b86cfd057fa56b"

RPROVIDES:${PN} += "ghc-file-embed-prof \
ghc-prof-file-embed-0.0.15.0-DAhwsrlSNND3ZIPejkHOUv"

RDEPENDS:${PN} += "ghc-file-embed-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-template-haskell-2.19.0.0"

inherit rpm
