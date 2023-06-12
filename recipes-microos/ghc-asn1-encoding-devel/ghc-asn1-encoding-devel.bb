SUMMARY = "Haskell asn1-encoding library development files"
DESCRIPTION = "This package provides the Haskell asn1-encoding library development files."
LICENSE = "BSD-3-Clause"

PV = "0.9.6"

RPM_NAME = "ghc-asn1-encoding-devel-0.9.6-8.3.aarch64.rpm"
RPM_HASH = "5a8bdd15ca68802e4f3e1dc0062a721bcc5ab0be82d764f9ecdbca27b198ff6c4f78738e43b60efe36603ae281e6681a57993f6bad7dfac64ca199ed5fcd3e36"

RPROVIDES:${PN} += "ghc-asn1-encoding-devel \
ghc-asn1-encoding-devel(aarch-64) \
ghc-devel(asn1-encoding-0.9.6-Hputs8NTOGr9EmEd7QDXHk)"
RDEPENDS:${PN} += "/bin/sh \
ghc-asn1-encoding \
ghc-compiler \
ghc-devel(asn1-types-0.3.4-GYlFjiH4jmgJII5TgUQfXm) \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(hourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3)"

inherit rpm
