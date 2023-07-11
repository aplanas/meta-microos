SUMMARY = "Haskell hslua-aeson profiling library"
DESCRIPTION = "This package provides the Haskell hslua-aeson profiling library."
LICENSE = "MIT"

PV = "2.3.0.1"

RPM_NAME = "ghc-hslua-aeson-prof-2.3.0.1-1.3.aarch64.rpm"
RPM_HASH = "5dd6cd8e89ef806c526315854f746806a7fd7441a1d3763d0236a786b1a2cbc9d7d6feed39449175859c08fcceb6991af3bd98ecb057b6387b8162da8a4e0255"

RPROVIDES:${PN} += "ghc-hslua-aeson-prof \
ghc-prof-hslua-aeson-2.3.0.1-6DckHj1FyFIAboJpo8be6E"

RDEPENDS:${PN} += "ghc-hslua-aeson-devel \
ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC \
ghc-prof-hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq \
ghc-prof-mtl-2.2.2 \
ghc-prof-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-prof-text-2.0.2 \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm
