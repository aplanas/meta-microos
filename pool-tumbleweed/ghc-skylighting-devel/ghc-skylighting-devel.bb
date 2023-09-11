SUMMARY = "Haskell skylighting library development files"
DESCRIPTION = "This package provides the Haskell skylighting library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.4.1"

RPM_NAME = "ghc-skylighting-devel-0.13.4.1-1.6.aarch64.rpm"
RPM_HASH = "779b94d525ca4c0f8d181dbecbb881474a552d754e8ec4587dc13e14435e8b572c9e93836db36ca652b8434b439fe632b89c84d67ed8fd88dd1493b133c3c2c6"

RPROVIDES:${PN} += "ghc-devel-skylighting-0.13.4.1-154hDBm9lstJ5eMNDkHcA5 \
ghc-skylighting-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.4.1-LOkep7AnSNN7QJDAXr031n \
ghc-devel-skylighting-format-ansi-0.1-8FyF1SOujOsEQ3XyvF7m1i \
ghc-devel-skylighting-format-blaze-html-0.1.1.1-8h5SzfFcahBGtm6dLTrui7 \
ghc-devel-skylighting-format-context-0.1.0.2-4E6TECMrJ1JH7PHte3jxUC \
ghc-devel-skylighting-format-latex-0.1-8a642fGNkPX9imnZQBlyrP \
ghc-skylighting"

inherit rpm
