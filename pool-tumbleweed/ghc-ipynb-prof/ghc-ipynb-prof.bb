SUMMARY = "Haskell ipynb profiling library"
DESCRIPTION = "This package provides the Haskell ipynb profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "ghc-ipynb-prof-0.2-2.3.aarch64.rpm"
RPM_HASH = "43f2a4ca3decf59f87b36f62c7c198227361bfc73cbea2436019a94cc87e760eb0d08bf3122d8db0a9fc8bf117c91a276f2da0502d0b0bed0633787ed07f9809"

RPROVIDES:${PN} += "ghc-ipynb-prof \
ghc-prof-ipynb-0.2-L0fucXiR4UEfjFQwta2fV"

RDEPENDS:${PN} += "ghc-ipynb-devel \
ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-base-4.17.1.0 \
ghc-prof-base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-text-2.0.2 \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E"

inherit rpm
