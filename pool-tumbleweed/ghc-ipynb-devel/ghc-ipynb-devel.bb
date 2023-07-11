SUMMARY = "Haskell ipynb library development files"
DESCRIPTION = "This package provides the Haskell ipynb library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "ghc-ipynb-devel-0.2-2.3.aarch64.rpm"
RPM_HASH = "92822601a43cc0e793e5a8fc401749aea8220ba9b5526203e83bf76d90a608d3d28c3fd3e7dadd8869613f8e04473e49dec79f1ec96f23939957b2efc2713537"

RPROVIDES:${PN} += "ghc-devel-ipynb-0.2-L0fucXiR4UEfjFQwta2fV \
ghc-ipynb-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-base-4.17.1.0 \
ghc-devel-base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-text-2.0.2 \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-ipynb"

inherit rpm
