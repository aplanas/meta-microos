SUMMARY = "Haskell skylighting-format-blaze-html library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-blaze-html library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-skylighting-format-blaze-html-devel-0.1.1-2.3.aarch64.rpm"
RPM_HASH = "026f25eedc4b6e6d1e8aefc22b543a8d797e576d1edcf46f38df10b86cb0ed0f9c53c83fd1b6b7e6fa9979fa41efada41a98c7adb4c2fe215dca89224af81afe"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-blaze-html-0.1.1-GSLRiRB6bjcEjUjplnknYR \
ghc-skylighting-format-blaze-html-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.2.1-6o4V0mA5OWyEHmMDE2dJ63 \
ghc-devel-text-2.0.2 \
ghc-skylighting-format-blaze-html"

inherit rpm
