SUMMARY = "Haskell singleton-bool library development files"
DESCRIPTION = "This package provides the Haskell singleton-bool library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "ghc-singleton-bool-devel-0.1.6-4.2.aarch64.rpm"
RPM_HASH = "6ac4b37ce8b3f8f87fcc1e29b686bbf70a4b6c58277b3a06258c510d8fb2bd67bb19be95369ec3edc111aa4ac58455011df9c022f760108e0a8c9489956f56cd"

RPROVIDES:${PN} += "ghc-devel(singleton-bool-0.1.6-9MbEj8pBx4EB1jZ66FdPc4) \
ghc-singleton-bool-devel \
ghc-singleton-bool-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(boring-0.2.1-J8lJX6Vz53r2bssyBwOtpl) \
ghc-devel(dec-0.0.5-4k85S2UkQTWCpK3j0IuOFm) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(some-1.0.5-3dwCpkSImpx8T8axxRPR3Z) \
ghc-singleton-bool"

inherit rpm
