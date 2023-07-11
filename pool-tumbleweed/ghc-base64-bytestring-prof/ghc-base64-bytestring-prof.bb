SUMMARY = "Haskell base64-bytestring profiling library"
DESCRIPTION = "This package provides the Haskell base64-bytestring profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-base64-bytestring-prof-1.2.1.0-2.6.aarch64.rpm"
RPM_HASH = "6b33fbfffc632bc30abf9bdcdb7d948836a2ba5fb9a36fab2d466b14706af28b85b789adb6149f271f750892ddb0047b5da7037300aef502a03b5ffa8ff39e63"

RPROVIDES:${PN} += "ghc-base64-bytestring-prof \
ghc-prof-base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh"

RDEPENDS:${PN} += "ghc-base64-bytestring-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0"

inherit rpm
