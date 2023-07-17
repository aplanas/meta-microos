SUMMARY = "Haskell typst profiling library"
DESCRIPTION = "This package provides the Haskell typst profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-typst-prof-0.1.0.0-1.5.aarch64.rpm"
RPM_HASH = "84fe8a3945a4ea5ad77844a13fd2aa0d08e400a49981a53a519b258d57da56163d62319ca099d176604edd2b8931857a30bb4b056a2e710b3ff48935dfdfa0f2"

RPROVIDES:${PN} += "ghc-prof-typst-0.1.0.0-KYQhPlbAv2KGc3iiEDbU9A \
ghc-typst-prof"

RDEPENDS:${PN} += "ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-cassava-0.5.3.0-6nKMpykUjDPH1yduUJ1iAD \
ghc-prof-containers-0.6.7 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-ordered-containers-0.2.3-2vvzHwtaKIjK7BBzxceSWT \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-pretty-1.1.3.6 \
ghc-prof-regex-tdfa-1.3.2.1-IjrqGmQfrKa7qAUI2VJCmV \
ghc-prof-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-prof-text-2.0.2 \
ghc-prof-typst-symbols-0.1.2-6B3ZvJm94WZ4qfFjRZShld \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-prof-xml-conduit-1.9.1.3-JDYavYDcwLN29rDQLTOOon \
ghc-prof-yaml-0.11.11.2-4GYYolDKkXn5x4zdb9DA59 \
ghc-typst-devel"

inherit rpm
