SUMMARY = "Haskell skylighting profiling library"
DESCRIPTION = "This package provides the Haskell skylighting profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.3"

RPM_NAME = "ghc-skylighting-prof-0.13.3-1.2.aarch64.rpm"
RPM_HASH = "a3ec6ce9feed6c1bce966e174dcbd3a4c94e7811ef619b8fb7490850395949cef48341f3509a6295679750e5b3a7d0be80065f0d4df92014db4bceef43ef0352"

RPROVIDES:${PN} += "ghc-prof-skylighting-0.13.3-KhN5DzrcPQALN95CsO2kAp \
ghc-skylighting-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-skylighting-core-0.13.3-9hBRKYwyArU4OdEqV8LbQv \
ghc-prof-skylighting-format-ansi-0.1-7wsekCwokAw5Lqh6kWpqBT \
ghc-prof-skylighting-format-blaze-html-0.1.1-F12UWgv4wxWHCG1WBLqTVs \
ghc-prof-skylighting-format-context-0.1.0.2-9kgX49cteJhG5oRziiwfwa \
ghc-prof-skylighting-format-latex-0.1-8E2kKavCeIp7J2nfRBTdHs \
ghc-skylighting-devel"

inherit rpm
