SUMMARY = "Haskell fast-logger profiling library"
DESCRIPTION = "This package provides the Haskell fast-logger profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.1.2"

RPM_NAME = "ghc-fast-logger-prof-3.1.2-1.12.aarch64.rpm"
RPM_HASH = "a34c7eb23c3eb0508b349cad80f02beebc334d4e5a2306a767bb9c5a5de4e16910d52d6f9603b84374dbc0317aba22515a58b3c783133d0a09464846ba19c3f6"

RPROVIDES:${PN} += "ghc-fast-logger-prof \
ghc-prof-fast-logger-3.1.2-2QS5oj3W57wGcX3QgTrERi"

RDEPENDS:${PN} += "ghc-fast-logger-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-auto-update-0.1.6-KWXusmyBOlPJNN5shLt5Bc \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-easy-file-0.2.5-IptebCGkAyyEfjLBFFjLI \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-text-2.0.2 \
ghc-prof-unix-compat-0.6-IJaiJvo5DQ6Elf7LVlEGei \
ghc-prof-unix-time-0.4.10-fuTENic3zHIuWAM5F0fYB"

inherit rpm
