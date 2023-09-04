SUMMARY = "Haskell language-c profiling library"
DESCRIPTION = "This package provides the Haskell language-c profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "ghc-language-c-prof-0.9.2-2.8.aarch64.rpm"
RPM_HASH = "b799fbe894bf8bba3e276c107a854306e7c3362d75258935910938b8a539ae6c319b058dc88f94881ebd4f2239dd7b3145bd6f4441c618e697dac8b10d452b7d"

RPROVIDES:${PN} += "ghc-language-c-prof \
ghc-prof-language-c-0.9.2-Ao2qt71CS5kEu13HVpHpG1"

RDEPENDS:${PN} += "ghc-language-c-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-pretty-1.1.3.6 \
ghc-prof-process-1.6.17.0"

inherit rpm
