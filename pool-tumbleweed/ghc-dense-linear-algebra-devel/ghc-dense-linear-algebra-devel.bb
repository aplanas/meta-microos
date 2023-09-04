SUMMARY = "Haskell dense-linear-algebra library development files"
DESCRIPTION = "This package provides the Haskell dense-linear-algebra library development \
files."
LICENSE = "BSD-2-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-dense-linear-algebra-devel-0.1.0.0-3.9.aarch64.rpm"
RPM_HASH = "c1ce299fecea60b5c4b442074d8d4f15a8c7e7da3b8891dd753da994aa3e20f2265332b9514bcb37e5d234660c717c854cd68ccbd15b8f1b2fbdb53a788172c9"

RPROVIDES:${PN} += "ghc-dense-linear-algebra-devel \
ghc-devel-dense-linear-algebra-0.1.0.0-FqLdJ2617mhFbXxVUig9Jj"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-dense-linear-algebra \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-math-functions-0.3.4.2-Ke5dPSL1fMD1KAZhy38VGR \
ghc-devel-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-devel-vector-algorithms-0.9.0.1-98Yktb3BX9p4L0Cowik6Gr \
ghc-devel-vector-binary-instances-0.2.5.2-DYVTg98S1IFCZ0TRySxTVW \
ghc-devel-vector-th-unbox-0.2.2-4Hl5syaTqnL4b2rNrCiqzQ"

inherit rpm
