SUMMARY = "Haskell timeit library development files"
DESCRIPTION = "This package provides the Haskell timeit library development files."
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "ghc-timeit-devel-2.0-6.3.aarch64.rpm"
RPM_HASH = "51a510976e9b858ba673d14fa6e1f06f0a035a85ecce5d5031e3d6643487527bda13aeb6c8dac6f0f08e9eb81a1eea02fa99566caf04b21a9665dc2dd9384b07"

RPROVIDES:${PN} += "ghc-devel-timeit-2.0-4alyyqlO7m4DFFkjYuUzq9 \
ghc-timeit-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-timeit"

inherit rpm
