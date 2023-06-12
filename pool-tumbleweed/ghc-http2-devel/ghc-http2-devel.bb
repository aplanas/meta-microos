SUMMARY = "Haskell http2 library development files"
DESCRIPTION = "This package provides the Haskell http2 library development files."
LICENSE = "BSD-3-Clause"

PV = "3.0.3"

RPM_NAME = "ghc-http2-devel-3.0.3-2.3.aarch64.rpm"
RPM_HASH = "0d57a415b20c3a5df1f139c693ff7138de4d9f05d425a9d2dc72c149e97740e8b0fc27e1bc5fff3eadabbafc33e63a87a354c6dfdad896f1a9e5d46260adffb4"

RPROVIDES:${PN} += "ghc-devel(http2-3.0.3-g8K2coD7lK8bFd8vR2MQJ) \
ghc-http2-devel \
ghc-http2-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(array-0.5.4.0) \
ghc-devel(async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF) \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3) \
ghc-devel(containers-0.6.7) \
ghc-devel(http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6) \
ghc-devel(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) \
ghc-devel(network-byte-order-0.1.6-9jNlcwvZjC3K8A2S0a4vrO) \
ghc-devel(psqueues-0.2.7.3-F3Vf47seRPn11NfFVgsy6O) \
ghc-devel(stm-2.5.1.0) \
ghc-devel(time-manager-0.0.0-49hD2RcPrUEG8anOiBePCj) \
ghc-devel(unix-time-0.4.9-DrdwBL0FLhc5jN9Hujlou0) \
ghc-http2"

inherit rpm
