SUMMARY = "Haskell skylighting-format-blaze-html library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-blaze-html library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-skylighting-format-blaze-html-devel-0.1.1-2.6.aarch64.rpm"
RPM_HASH = "141e6d30a65d16a1bf7479ad5b2f227bd59bfa888f1250b1acca8498e84f7ace9a0d87e11d5572196bd4100e922311ded344f7615ca53badff37b87391509eec"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-blaze-html-0.1.1-96IxqoyNHvLGcjrkFPKZr9 \
ghc-skylighting-format-blaze-html-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.4.1-6Bsu3Qo0E1u1DqUSYo1bSc \
ghc-devel-text-2.0.2 \
ghc-skylighting-format-blaze-html"

inherit rpm
