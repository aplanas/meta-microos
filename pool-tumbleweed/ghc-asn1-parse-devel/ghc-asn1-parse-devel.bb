SUMMARY = "Haskell asn1-parse library development files"
DESCRIPTION = "This package provides the Haskell asn1-parse library development files."
LICENSE = "BSD-3-Clause"

PV = "0.9.5"

RPM_NAME = "ghc-asn1-parse-devel-0.9.5-6.4.aarch64.rpm"
RPM_HASH = "87088fac7a43f0f5134814f5b81bc93feedf92c364b7ba4df9200614b76fd215590abb0ce3013367d8850a3519a2fa45fdac68757485d58291f36a8b03d98e3e"

RPROVIDES:${PN} += "ghc-asn1-parse-devel \
ghc-devel-asn1-parse-0.9.5-BHBxQSMDAmU3iO1lXgL9KG"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-asn1-parse \
ghc-compiler \
ghc-devel-asn1-encoding-0.9.6-G74cB7z1f0LBAKbqoDvYt6 \
ghc-devel-asn1-types-0.3.4-7Qw76BNtuiJIUHv1x3z9in \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1"

inherit rpm
