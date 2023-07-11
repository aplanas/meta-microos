SUMMARY = "Haskell typst profiling library"
DESCRIPTION = "This package provides the Haskell typst profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-typst-prof-0.1.0.0-1.2.aarch64.rpm"
RPM_HASH = "2decafdbaeb83626a91d1c7eff57abd87f2fdee5a82db05377bf86b32df53afe4594388ccc54c1f49918c417364effe70265db866682470ab853de337fb42abd"

RPROVIDES:${PN} += "ghc-prof-typst-0.1.0.0-3VBCZ4Q02O47LMJn0K0CF8 \
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
ghc-prof-typst-symbols-0.1.0.1-68asM8ctSWGeebFauBl8u \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-prof-xml-conduit-1.9.1.3-JDYavYDcwLN29rDQLTOOon \
ghc-prof-yaml-0.11.11.1-3T1xu4983kFHb1qERRZhqW \
ghc-typst-devel"

inherit rpm
