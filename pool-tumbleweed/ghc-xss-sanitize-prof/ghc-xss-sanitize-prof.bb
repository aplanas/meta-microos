SUMMARY = "Haskell xss-sanitize profiling library"
DESCRIPTION = "This package provides the Haskell xss-sanitize profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.3.7.2"

RPM_NAME = "ghc-xss-sanitize-prof-0.3.7.2-1.9.aarch64.rpm"
RPM_HASH = "6f89d3ac29c4e94317b8fb474746a7bed38c09fdd22989b14e2b9771c50d6d6b07c8863e63b9326187f3313156b0bc3a1d72f9a5684283d61e2c3f56a42ad9a8"

RPROVIDES:${PN} += "ghc-prof-xss-sanitize-0.3.7.2-6wMPG57mjpfFkiVWmO24My \
ghc-xss-sanitize-prof"

RDEPENDS:${PN} += "ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-css-text-0.1.3.0-8klVmv0TGJS6WEADR2StQO \
ghc-prof-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-prof-tagsoup-0.14.8-FUMcGuRz5feAeL2vCCRpAn \
ghc-prof-text-2.0.2 \
ghc-prof-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-xss-sanitize-devel"

inherit rpm
