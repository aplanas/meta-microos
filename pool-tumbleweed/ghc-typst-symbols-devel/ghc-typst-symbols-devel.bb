SUMMARY = "Haskell typst-symbols library development files"
DESCRIPTION = "This package provides the Haskell typst-symbols library development files."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "ghc-typst-symbols-devel-0.1.2-1.1.aarch64.rpm"
RPM_HASH = "e4833b7f296488d58dd7b8868f1fd8e3a686b4ca74b4d9797721c3896d0938cb3c55dac42d0fc0adc9c97661e3ee0704287da704e9d2ae204943c0d5989cf7b8"

RPROVIDES:${PN} += "ghc-devel-typst-symbols-0.1.2-6B3ZvJm94WZ4qfFjRZShld \
ghc-typst-symbols-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-text-2.0.2 \
ghc-typst-symbols"

inherit rpm
