SUMMARY = "Haskell libmpd library development files"
DESCRIPTION = "This package provides the Haskell libmpd library development files."
LICENSE = "MIT"

PV = "0.10.0.0"

RPM_NAME = "ghc-libmpd-devel-0.10.0.0-2.3.aarch64.rpm"
RPM_HASH = "dd9fcd3b929a5ca839e3395ddedac38b76a93324920d75b1d1b26d174fdc732f8c91e2eecaff9cff8338e2b198fc9c0f5afb42f5521523afca9b461807b003a0"

RPROVIDES:${PN} += "ghc-devel(libmpd-0.10.0.0-LD6WRi8pb0r8mm5YrtyxA5) \
ghc-libmpd-devel \
ghc-libmpd-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(mtl-2.2.2) \
ghc-devel(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) \
ghc-devel(safe-exceptions-0.1.7.3-4ydW60ruqZ4IdMpKf3b6BD) \
ghc-devel(text-2.0.2) \
ghc-devel(time-1.12.2) \
ghc-devel(utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q) \
ghc-libmpd"

inherit rpm
