SUMMARY = "Haskell skylighting library development files"
DESCRIPTION = "This package provides the Haskell skylighting library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.4.1"

RPM_NAME = "ghc-skylighting-devel-0.13.4.1-1.1.aarch64.rpm"
RPM_HASH = "4ca72a4d1db2f1899a99928f2c25b9a771b246189723c2770283aec7f35e3229191922191f3bea5b8e059c915f056338010391fe2ccecf5a3c080a71c2159d7e"

RPROVIDES:${PN} += "ghc-devel-skylighting-0.13.4.1-CU1AlEko5yK2gCD1OmtnCm \
ghc-skylighting-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.4.1-6Bsu3Qo0E1u1DqUSYo1bSc \
ghc-devel-skylighting-format-ansi-0.1-6378BOa13TnAAEhx7jAIGl \
ghc-devel-skylighting-format-blaze-html-0.1.1-96IxqoyNHvLGcjrkFPKZr9 \
ghc-devel-skylighting-format-context-0.1.0.2-I1BZIYXYOqlBramxRueIsx \
ghc-devel-skylighting-format-latex-0.1-J2O8wjQxddL48jSKv998Ye \
ghc-skylighting"

inherit rpm
