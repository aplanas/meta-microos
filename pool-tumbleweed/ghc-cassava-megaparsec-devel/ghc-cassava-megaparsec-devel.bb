SUMMARY = "Haskell cassava-megaparsec library development files"
DESCRIPTION = "This package provides the Haskell cassava-megaparsec library development \
files."
LICENSE = "MIT"

PV = "2.0.4"

RPM_NAME = "ghc-cassava-megaparsec-devel-2.0.4-3.3.aarch64.rpm"
RPM_HASH = "373ea58386d9a0df312e969a2f5e2cfc75f408e4e7c4ae0b514660b1c833bf3b1c1c0fa3427b183732c7f6a9e389d2a852d1d849d5c6dda811f3e811a744ed1d"

RPROVIDES:${PN} += "ghc-cassava-megaparsec-devel \
ghc-devel-cassava-megaparsec-2.0.4-HU3QoIYvAPIHgP080eBDPM"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cassava-megaparsec \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-cassava-0.5.3.0-6nKMpykUjDPH1yduUJ1iAD \
ghc-devel-megaparsec-9.3.1-Lptmv1Cc41nKt1ZYt8kXVr \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm
