SUMMARY = "Haskell skylighting library development files"
DESCRIPTION = "This package provides the Haskell skylighting library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.3"

RPM_NAME = "ghc-skylighting-devel-0.13.3-1.2.aarch64.rpm"
RPM_HASH = "0d80efc2928a66879ebae927b7595c2eec86e470bc1137bee6c0758a0826162e2183bdc9334b8ecd42b5e54e791257954ad5168e29487926bad741842d99c362"

RPROVIDES:${PN} += "ghc-devel-skylighting-0.13.3-KhN5DzrcPQALN95CsO2kAp \
ghc-skylighting-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.3-9hBRKYwyArU4OdEqV8LbQv \
ghc-devel-skylighting-format-ansi-0.1-7wsekCwokAw5Lqh6kWpqBT \
ghc-devel-skylighting-format-blaze-html-0.1.1-F12UWgv4wxWHCG1WBLqTVs \
ghc-devel-skylighting-format-context-0.1.0.2-9kgX49cteJhG5oRziiwfwa \
ghc-devel-skylighting-format-latex-0.1-8E2kKavCeIp7J2nfRBTdHs \
ghc-skylighting"

inherit rpm
