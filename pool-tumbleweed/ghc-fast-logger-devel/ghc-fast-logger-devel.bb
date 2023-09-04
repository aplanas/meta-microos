SUMMARY = "Haskell fast-logger library development files"
DESCRIPTION = "This package provides the Haskell fast-logger library development files."
LICENSE = "BSD-3-Clause"

PV = "3.1.2"

RPM_NAME = "ghc-fast-logger-devel-3.1.2-1.12.aarch64.rpm"
RPM_HASH = "de5252ab0b98fdb428fe8972b4f9bf77d648d6f8f43f9a916cd13380d0c1e33211a8e26fdbc6f207bae1ecb5fb606f56a04f9dbbaf867c808588957cce8a6e51"

RPROVIDES:${PN} += "ghc-devel-fast-logger-3.1.2-2QS5oj3W57wGcX3QgTrERi \
ghc-fast-logger-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-auto-update-0.1.6-KWXusmyBOlPJNN5shLt5Bc \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-easy-file-0.2.5-IptebCGkAyyEfjLBFFjLI \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-text-2.0.2 \
ghc-devel-unix-compat-0.6-IJaiJvo5DQ6Elf7LVlEGei \
ghc-devel-unix-time-0.4.10-fuTENic3zHIuWAM5F0fYB \
ghc-fast-logger"

inherit rpm
