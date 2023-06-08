SUMMARY = "Haskell bifunctors library development files"
DESCRIPTION = "This package provides the Haskell bifunctors library development files."
LICENSE = "BSD-2-Clause"

PV = "5.5.15"

RPM_NAME = "ghc-bifunctors-devel-5.5.15-1.3.aarch64.rpm"
RPM_HASH = "e64056308caa2e6f9363e8f4a906cd8e3d4239565562838b51a4c22ae02d1f8616ba44619549b7cd3be47bd105ccb8fe016e8505ac9504088a6c67f0563d24e3"

RPROVIDES:${PN} += "ghc-bifunctors-devel ghc-bifunctors-devel(aarch-64) ghc-devel(bifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL)"
RDEPENDS:${PN} += "/bin/sh ghc-bifunctors ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8) ghc-devel(comonad-5.0.8-9UnH7KDg5138z3eBCPM7y4) ghc-devel(containers-0.6.7) ghc-devel(tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa) ghc-devel(template-haskell-2.19.0.0) ghc-devel(th-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT) ghc-devel(transformers-0.5.6.2)"

inherit rpm
