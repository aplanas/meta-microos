SUMMARY = "Haskell bifunctors library development files"
DESCRIPTION = "This package provides the Haskell bifunctors library development files."
LICENSE = "BSD-2-Clause"

PV = "5.5.15"

RPM_NAME = "ghc-bifunctors-devel-5.5.15-1.6.aarch64.rpm"
RPM_HASH = "a593fac69dcde19f16c538b1286af327b4abe232a1959f3e221c6f072e3d771fce954b968bbdb48e3994d91ff62600b46fbf55f1a2783dc9fecd7505f1ce9231"

RPROVIDES:${PN} += "ghc-bifunctors-devel \
ghc-devel-bifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-bifunctors \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8 \
ghc-devel-comonad-5.0.8-9UnH7KDg5138z3eBCPM7y4 \
ghc-devel-containers-0.6.7 \
ghc-devel-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-th-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT \
ghc-devel-transformers-0.5.6.2"

inherit rpm
