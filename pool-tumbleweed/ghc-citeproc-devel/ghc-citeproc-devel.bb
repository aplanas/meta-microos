SUMMARY = "Haskell citeproc library development files"
DESCRIPTION = "This package provides the Haskell citeproc library development files."
LICENSE = "BSD-2-Clause"

PV = "0.8.1"

RPM_NAME = "ghc-citeproc-devel-0.8.1-2.4.aarch64.rpm"
RPM_HASH = "f7d2948f291c05296d59a87af78af32c80142b8dca9394c66181a734b64a0d410049d1399018f497e9a3d5fd1de57e9468d7f7976f90ab0aa17ee78a479a40f5"

RPROVIDES:${PN} += "ghc-citeproc-devel \
ghc-devel-citeproc-0.8.1-1D0nfQHnF7b6sejYb0d6Zi"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-citeproc \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP \
ghc-devel-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-devel-file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-pandoc-types-1.23-EFziwPO22I72D2SxHphq63 \
ghc-devel-safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds \
ghc-devel-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unicode-collation-0.1.3.4-LMKRbY0RRBBKxwMiir45sP \
ghc-devel-uniplate-1.6.13-3GboCmnxCZ4BmbYwVaL4sN \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-devel-xml-conduit-1.9.1.2-EG4w0oWu477B6XYo8w0Zz4"

inherit rpm
