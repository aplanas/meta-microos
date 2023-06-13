SUMMARY = "Haskell these library development files"
DESCRIPTION = "This package provides the Haskell these library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1.1.1"

RPM_NAME = "ghc-these-devel-1.1.1.1-9.3.aarch64.rpm"
RPM_HASH = "0de5f8c739a29d6f9d5f26062f2048259515e46b6f5a327715c718146cfdb012c25fb54747c60496a93dcaad49997f4ed45f5abfcf1bb8a2b7eec618a4cbeacb"

RPROVIDES:${PN} += "ghc-devel(these-1.1.1.1-3POHYes25uBIW53bcrDd39) \
ghc-these-devel \
ghc-these-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(assoc-1.0.2-IAwklVGxRFw6xcadvaWWl7) \
ghc-devel(base-4.17.1.0) \
ghc-devel(binary-0.8.9.1) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) \
ghc-these"

inherit rpm
