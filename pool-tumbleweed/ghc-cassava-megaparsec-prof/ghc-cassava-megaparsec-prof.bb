SUMMARY = "Haskell cassava-megaparsec profiling library"
DESCRIPTION = "This package provides the Haskell cassava-megaparsec profiling library."
LICENSE = "MIT"

PV = "2.0.4"

RPM_NAME = "ghc-cassava-megaparsec-prof-2.0.4-3.3.aarch64.rpm"
RPM_HASH = "68c40a6d227c01b6f17c6e1a8342da1c40af8e3a0c57b439b19430c8388e65a945894bfb1e4d11d119c8a4c4defb132b1bdf3f91ea6cc72e6c14ebda96de6ff6"

RPROVIDES:${PN} += "ghc-cassava-megaparsec-prof \
ghc-prof-cassava-megaparsec-2.0.4-HU3QoIYvAPIHgP080eBDPM"

RDEPENDS:${PN} += "ghc-cassava-megaparsec-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-cassava-0.5.3.0-6nKMpykUjDPH1yduUJ1iAD \
ghc-prof-megaparsec-9.3.1-Lptmv1Cc41nKt1ZYt8kXVr \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm
