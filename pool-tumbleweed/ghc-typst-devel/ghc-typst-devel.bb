SUMMARY = "Haskell typst library development files"
DESCRIPTION = "This package provides the Haskell typst library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-typst-devel-0.1.0.0-1.2.aarch64.rpm"
RPM_HASH = "5ea8ff7b1c0ccb0cf3cc4c1a7cf5fefbfa9d2f89f985721301ed1ae62ec312b21da72c920e6a33a6bd502974b421fc3fb6bbcf266b1fc68679e92d6395a4d2d1"

RPROVIDES:${PN} += "ghc-devel-typst-0.1.0.0-3VBCZ4Q02O47LMJn0K0CF8 \
ghc-typst-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-cassava-0.5.3.0-6nKMpykUjDPH1yduUJ1iAD \
ghc-devel-containers-0.6.7 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-ordered-containers-0.2.3-2vvzHwtaKIjK7BBzxceSWT \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-pretty-1.1.3.6 \
ghc-devel-regex-tdfa-1.3.2.1-IjrqGmQfrKa7qAUI2VJCmV \
ghc-devel-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-devel-text-2.0.2 \
ghc-devel-typst-symbols-0.1.0.1-68asM8ctSWGeebFauBl8u \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-devel-xml-conduit-1.9.1.3-JDYavYDcwLN29rDQLTOOon \
ghc-devel-yaml-0.11.11.1-3T1xu4983kFHb1qERRZhqW \
ghc-typst"

inherit rpm
