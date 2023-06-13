SUMMARY = "Haskell base64-bytestring library development files"
DESCRIPTION = "This package provides the Haskell base64-bytestring library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-base64-bytestring-devel-1.2.1.0-2.3.aarch64.rpm"
RPM_HASH = "dc86ecf6654cfecdc3aaa7586849ddaa7b5bcae97e34e1b8bf27c357c303653dea07e40c714db124045000fb028354873ac06f50ecf22f16bbf697cde3824f62"

RPROVIDES:${PN} += "ghc-base64-bytestring-devel \
ghc-base64-bytestring-devel(aarch-64) \
ghc-devel(base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh)"

RDEPENDS:${PN} += "/bin/sh \
ghc-base64-bytestring \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0)"

inherit rpm
