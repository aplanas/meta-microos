SUMMARY = "Haskell file-embed profiling library"
DESCRIPTION = "This package provides the Haskell file-embed profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.0.15.0"

RPM_NAME = "ghc-file-embed-prof-0.0.15.0-2.2.aarch64.rpm"
RPM_HASH = "3abe14fcffe82a62b4c7d14d0e3d7cf70cafa6dc59895ba2718054628cd21e82642c60a351021eaf6f5fd8b820d19e4473e75f8f420903a9288b5b605def453e"

RPROVIDES:${PN} += "ghc-file-embed-prof \
ghc-prof-file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw"

RDEPENDS:${PN} += "ghc-file-embed-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-template-haskell-2.19.0.0"

inherit rpm
