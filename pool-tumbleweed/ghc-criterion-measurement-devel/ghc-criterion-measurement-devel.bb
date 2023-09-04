SUMMARY = "Haskell criterion-measurement library development files"
DESCRIPTION = "This package provides the Haskell criterion-measurement library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.0"

RPM_NAME = "ghc-criterion-measurement-devel-0.2.1.0-1.7.aarch64.rpm"
RPM_HASH = "98af69e7ddb3a6bf4bd7a4219fe725f29b6094f9120a103b18eb2bf3d6acb5bf34305ad9db671c15eff13454a936e011f5913f58173378c192a289a474fb9f68"

RPROVIDES:${PN} += "ghc-criterion-measurement-devel \
ghc-devel-criterion-measurement-0.2.1.0-2AOdhJohtCNDtfUJjSL1gP"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-criterion-measurement \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-base-4.17.2.0 \
ghc-devel-base-compat-0.13.0-ASw4phAd2I0LrTJ4o8lXb1 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm
