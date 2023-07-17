SUMMARY = "Haskell http2 profiling library"
DESCRIPTION = "This package provides the Haskell http2 profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.0.3"

RPM_NAME = "ghc-http2-prof-3.0.3-2.10.aarch64.rpm"
RPM_HASH = "d35621ce34b0d01f28a17b4f3c67b845e0640f3c7b7370b00a37ae6413cc38b0d4f6586b62cf486c2915a597aa63cb8321cd4c39c81412a24593e1eed5ad1341"

RPROVIDES:${PN} += "ghc-http2-prof \
ghc-prof-http2-3.0.3-C8jMo1PWq0Httjut7cZnE"

RDEPENDS:${PN} += "ghc-http2-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-prof-containers-0.6.7 \
ghc-prof-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-prof-network-byte-order-0.1.6-9jNlcwvZjC3K8A2S0a4vrO \
ghc-prof-psqueues-0.2.7.3-F3Vf47seRPn11NfFVgsy6O \
ghc-prof-stm-2.5.1.0 \
ghc-prof-time-manager-0.0.0-49hD2RcPrUEG8anOiBePCj \
ghc-prof-unix-time-0.4.10-LpZG5YAXe572FFFZnKOLQq"

inherit rpm
