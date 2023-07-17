SUMMARY = "Haskell typst library development files"
DESCRIPTION = "This package provides the Haskell typst library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-typst-devel-0.1.0.0-1.5.aarch64.rpm"
RPM_HASH = "1036fbcf1d862391b3258d8ba1e1dac6c7948da0911bcfb5b682eec1d21fdff114c9ab7ed765461f5fcebc8f2955da0895c0b5af57fa402bb730e154ed197cfa"

RPROVIDES:${PN} += "ghc-devel-typst-0.1.0.0-KYQhPlbAv2KGc3iiEDbU9A \
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
ghc-devel-typst-symbols-0.1.2-6B3ZvJm94WZ4qfFjRZShld \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-devel-xml-conduit-1.9.1.3-JDYavYDcwLN29rDQLTOOon \
ghc-devel-yaml-0.11.11.2-4GYYolDKkXn5x4zdb9DA59 \
ghc-typst"

inherit rpm
