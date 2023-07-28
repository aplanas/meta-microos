SUMMARY = "Haskell cassava library development files"
DESCRIPTION = "This package provides the Haskell cassava library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.3.0"

RPM_NAME = "ghc-cassava-devel-0.5.3.0-3.1.aarch64.rpm"
RPM_HASH = "bec3c2ac2fd481e99acda08d7c4abcc065078b57aa481067d68d10e7ae8e715f389d82e2e08624888a8c8dd962081bfcb2e11ddb8864f316bb2ff1f47c494fe3"

RPROVIDES:${PN} += "ghc-cassava-devel \
ghc-devel-cassava-0.5.3.0-6nKMpykUjDPH1yduUJ1iAD"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cassava \
ghc-compiler \
ghc-devel-Only-0.1-ETd5YCT0TwGLbN8rgpgTS8 \
ghc-devel-array-0.5.4.0 \
ghc-devel-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-devel-text-2.0.2 \
ghc-devel-text-short-0.1.5-82jy4M6AvoMDwlCMY2Ykx2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm
