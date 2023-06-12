SUMMARY = "Haskell bloomfilter library development files"
DESCRIPTION = "This package provides the Haskell bloomfilter library development files."
LICENSE = "BSD-3-Clause"

PV = "2.0.1.0"

RPM_NAME = "ghc-bloomfilter-devel-2.0.1.0-6.3.aarch64.rpm"
RPM_HASH = "cc77d59f4e7b4a7d6e18b9abc86c9cad88290b68a4e6edf6311dd785208cb337c8db66a75c01f3d48ade8ad358c8a7265391efca12ecfd98c0650495cea7f1e8"

RPROVIDES:${PN} += "ghc-bloomfilter-devel \
ghc-bloomfilter-devel(aarch-64) \
ghc-devel(bloomfilter-2.0.1.0-3hF1ySDPbPQA7KQQeHgCqI)"
RDEPENDS:${PN} += "/bin/sh \
ghc-bloomfilter \
ghc-compiler \
ghc-devel(array-0.5.4.0) \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(deepseq-1.4.8.0)"

inherit rpm
