SUMMARY = "Haskell language-c library development files"
DESCRIPTION = "This package provides the Haskell language-c library development files."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "ghc-language-c-devel-0.9.2-2.3.aarch64.rpm"
RPM_HASH = "d838defeb6dcf6388ffdb63787c83f73050c0af0cd7f295fb96ca8670faf0a05c54dbbf496629b4361f14fe3a44d3240589cb5670621e4635e296449c3bcf41d"

RPROVIDES:${PN} += "ghc-devel(language-c-0.9.2-5l7vUWhvlwnEvBOKlkChTz) \
ghc-language-c-devel \
ghc-language-c-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(array-0.5.4.0) \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(directory-1.3.7.1) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(mtl-2.2.2) \
ghc-devel(pretty-1.1.3.6) \
ghc-devel(process-1.6.16.0) \
ghc-language-c"

inherit rpm
