SUMMARY = "Haskell clock library documentation"
DESCRIPTION = "This package provides the Haskell clock library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.4"

RPM_NAME = "ghc-clock-doc-0.8.4-1.2.noarch.rpm"
RPM_HASH = "76caeb1c113f275bc66f750bc92311224e4121b855b659b863896b601c0d88daeb037d07114b26f0b34d9b8c7cef491745146e7a3537867ae7543cf2fdcfa2a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-clock-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
