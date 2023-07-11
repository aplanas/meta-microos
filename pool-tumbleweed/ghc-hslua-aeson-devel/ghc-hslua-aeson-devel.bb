SUMMARY = "Haskell hslua-aeson library development files"
DESCRIPTION = "This package provides the Haskell hslua-aeson library development files."
LICENSE = "MIT"

PV = "2.3.0.1"

RPM_NAME = "ghc-hslua-aeson-devel-2.3.0.1-1.3.aarch64.rpm"
RPM_HASH = "11b720a54329be6caaf4aff4f173a18ff2f72894affa8fb7fb97625b089c90268cd7e5cf9dc564c9cd5d8a31cc571f4bc8a25eaeb8a1f0c635b562cecc391683"

RPROVIDES:${PN} += "ghc-devel-hslua-aeson-2.3.0.1-6DckHj1FyFIAboJpo8be6E \
ghc-hslua-aeson-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC \
ghc-devel-hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq \
ghc-devel-mtl-2.2.2 \
ghc-devel-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-devel-text-2.0.2 \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-hslua-aeson"

inherit rpm
