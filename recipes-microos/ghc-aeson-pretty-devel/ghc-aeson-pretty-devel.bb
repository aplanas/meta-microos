SUMMARY = "Haskell aeson-pretty library development files"
DESCRIPTION = "This package provides the Haskell aeson-pretty library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.9"

RPM_NAME = "ghc-aeson-pretty-devel-0.8.9-4.2.aarch64.rpm"
RPM_HASH = "56cae3e3359674b5eeb9c0632b3c3a7b8a98daf8ea1352452c00a1aee9100475c6f0f4237a901d7e74e07658b22a00b995b3184bd8cfbf0b469ecedd5b67333c"

RPROVIDES:${PN} += "ghc-aeson-pretty-devel ghc-aeson-pretty-devel(aarch-64) ghc-devel(aeson-pretty-0.8.9-LUjG36DF6cc5sU1N5Uw0pr)"
RDEPENDS:${PN} += "/bin/sh ghc-aeson-pretty ghc-compiler ghc-devel(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) ghc-devel(base-4.17.1.0) ghc-devel(base-compat-0.12.2-L1DEOlMQJOdFOKsjHoWYov) ghc-devel(bytestring-0.11.4.0) ghc-devel(scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1) ghc-devel(text-2.0.2) ghc-devel(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) ghc-devel(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp)"

inherit rpm
