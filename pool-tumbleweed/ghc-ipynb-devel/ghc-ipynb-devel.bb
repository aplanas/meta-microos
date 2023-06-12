SUMMARY = "Haskell ipynb library development files"
DESCRIPTION = "This package provides the Haskell ipynb library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "ghc-ipynb-devel-0.2-2.2.aarch64.rpm"
RPM_HASH = "fe7dc161cc2939790f861339b6abfac7c6c9b5d6251de054d4a5e664fec86ec9e9eadb8a7eaf15b9fcbbd232d7b8f14a2e2c78620938bc38c3e049051cc147fa"

RPROVIDES:${PN} += "ghc-devel(ipynb-0.2-5jt56R8prxRLKDISePbcpi) \
ghc-ipynb-devel \
ghc-ipynb-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-devel(base-4.17.1.0) \
ghc-devel(base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(text-2.0.2) \
ghc-devel(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) \
ghc-ipynb"

inherit rpm
