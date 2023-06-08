SUMMARY = "Haskell hslua-aeson library development files"
DESCRIPTION = "This package provides the Haskell hslua-aeson library development files."
LICENSE = "MIT"

PV = "2.3.0.1"

RPM_NAME = "ghc-hslua-aeson-devel-2.3.0.1-1.2.aarch64.rpm"
RPM_HASH = "652c6f64c30ef212bed5ae06877d155d78acfd62e54361ce035f9ca9ac7e0c4f45e2d7c0bcba09707247c80cf4629c9445104be7049405fc52165e8792e7c309"

RPROVIDES:${PN} += "ghc-devel(hslua-aeson-2.3.0.1-E4tasg1dFJ86CDrMHWRi4i) ghc-hslua-aeson-devel ghc-hslua-aeson-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) ghc-devel(base-4.17.1.0) ghc-devel(bytestring-0.11.4.0) ghc-devel(containers-0.6.7) ghc-devel(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) ghc-devel(hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC) ghc-devel(hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq) ghc-devel(mtl-2.2.2) ghc-devel(scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1) ghc-devel(text-2.0.2) ghc-devel(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) ghc-devel(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) ghc-hslua-aeson"

inherit rpm
