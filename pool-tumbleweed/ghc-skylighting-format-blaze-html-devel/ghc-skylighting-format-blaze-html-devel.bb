SUMMARY = "Haskell skylighting-format-blaze-html library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-blaze-html library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-skylighting-format-blaze-html-devel-0.1.1.1-1.1.aarch64.rpm"
RPM_HASH = "fc82ade65af06baa73f924a910e5fa2a668f914f657e81574a4f332208a726f9deebcc06d67b46ba715d34498e19562630ec7993d6c5f547fc962e74c450a669"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-blaze-html-0.1.1.1-8h5SzfFcahBGtm6dLTrui7 \
ghc-skylighting-format-blaze-html-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-blaze-html-0.9.1.2-5H8nSo5QBpfC5vHZY7C1Ii \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.4.1-LOkep7AnSNN7QJDAXr031n \
ghc-devel-text-2.0.2 \
ghc-skylighting-format-blaze-html"

inherit rpm
