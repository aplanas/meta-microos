SUMMARY = "Haskell constraints library development files"
DESCRIPTION = "This package provides the Haskell constraints library development files."
LICENSE = "BSD-2-Clause"

PV = "0.13.4"

RPM_NAME = "ghc-constraints-devel-0.13.4-3.2.aarch64.rpm"
RPM_HASH = "f890bec0fc7a629696d6cdc16539530a08971430b83d3360c470a560f217313e3057f904a19a87ffab69ea70634cf4298b95c801e9893ce12deeb1bf40d31bea"

RPROVIDES:${PN} += "ghc-constraints-devel \
ghc-devel-constraints-0.13.4-7HFJx00f7ri8MCLIfNZmvk"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-constraints \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-mtl-2.2.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM \
ghc-devel-type-equality-1-GeDZojRKCH6645jDbV5JLU"

inherit rpm
