SUMMARY = "Haskell http2 library development files"
DESCRIPTION = "This package provides the Haskell http2 library development files."
LICENSE = "BSD-3-Clause"

PV = "3.0.3"

RPM_NAME = "ghc-http2-devel-3.0.3-2.10.aarch64.rpm"
RPM_HASH = "e0a2eea1e45548c92e9cfe1c6fc8698334a19ebfdf7eee3c3d2753827f5679ef42e817751ae84d9dbaa5af668c2091cc8d44a48024550b05640c735503477839"

RPROVIDES:${PN} += "ghc-devel-http2-3.0.3-C8jMo1PWq0Httjut7cZnE \
ghc-http2-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-devel-containers-0.6.7 \
ghc-devel-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-devel-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-devel-network-byte-order-0.1.6-9jNlcwvZjC3K8A2S0a4vrO \
ghc-devel-psqueues-0.2.7.3-F3Vf47seRPn11NfFVgsy6O \
ghc-devel-stm-2.5.1.0 \
ghc-devel-time-manager-0.0.0-49hD2RcPrUEG8anOiBePCj \
ghc-devel-unix-time-0.4.10-LpZG5YAXe572FFFZnKOLQq \
ghc-http2"

inherit rpm
