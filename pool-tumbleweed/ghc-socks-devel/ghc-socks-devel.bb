SUMMARY = "Haskell socks library development files"
DESCRIPTION = "This package provides the Haskell socks library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-socks-devel-0.6.1-6.9.aarch64.rpm"
RPM_HASH = "720bdb7ef1c3f188341bdd6d6243c1912a6b1a97316a5efb7630854a452612c447f915753c6025828597edc96564354fbed838d36a25c9acbabd727c91575149"

RPROVIDES:${PN} += "ghc-devel-socks-0.6.1-5RVEIbYAf8qJqchdUVHVHw \
ghc-socks-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-basement-0.0.16-JDtFhm6hoERETf7Hqk4dh9 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-cereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-socks"

inherit rpm
