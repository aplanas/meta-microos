SUMMARY = "Haskell vector-stream library development files"
DESCRIPTION = "This package provides the Haskell vector-stream library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-vector-stream-devel-0.1.0.0-3.1.aarch64.rpm"
RPM_HASH = "3fad752460e366d0afe38cc591c76a8fda01e1fadd6c3e31fe8f88c8112e053f23ef8f966a14bcfb030572dd227fe672e02433127bb4cbc6e517dceb1ce61729"

RPROVIDES:${PN} += "ghc-devel-vector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB \
ghc-vector-stream-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-ghc-prim-0.9.1 \
ghc-vector-stream"

inherit rpm
