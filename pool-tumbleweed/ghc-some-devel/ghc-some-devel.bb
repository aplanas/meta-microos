SUMMARY = "Haskell some library development files"
DESCRIPTION = "This package provides the Haskell some library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "ghc-some-devel-1.0.5-1.8.aarch64.rpm"
RPM_HASH = "e5768ac96148122146035561f9d433f21bb57177bf4a047bf2d5633633b32dc6a97645e535e3b56f05a80f9fbbb3120925ba524f376bd463fd776d4e202d7cb2"

RPROVIDES:${PN} += "ghc-devel-some-1.0.5-EryUniFNYOB2ktd7SoyKUW \
ghc-some-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-some"

inherit rpm
