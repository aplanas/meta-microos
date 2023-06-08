SUMMARY = "Haskell citeproc profiling library"
DESCRIPTION = "This package provides the Haskell citeproc profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.8.1"

RPM_NAME = "ghc-citeproc-prof-0.8.1-2.4.aarch64.rpm"
RPM_HASH = "1bb204f6276e93e6041efaca6c5eb4ad5d9da1efb0323bd5658d8fa03664dc63e36a9e3e3c2e56be921b2ddde3014e78ccce8cd25f9cfc4491cc0ca1da6b6428"

RPROVIDES:${PN} += "ghc-citeproc-prof ghc-citeproc-prof(aarch-64) ghc-prof(citeproc-0.8.1-1D0nfQHnF7b6sejYb0d6Zi)"
RDEPENDS:${PN} += "ghc-citeproc-devel ghc-prof(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) ghc-prof(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3) ghc-prof(containers-0.6.7) ghc-prof(data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy) ghc-prof(file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw) ghc-prof(filepath-1.4.2.2) ghc-prof(pandoc-types-1.23-EFziwPO22I72D2SxHphq63) ghc-prof(safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds) ghc-prof(scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1) ghc-prof(text-2.0.2) ghc-prof(transformers-0.5.6.2) ghc-prof(unicode-collation-0.1.3.4-LMKRbY0RRBBKxwMiir45sP) ghc-prof(uniplate-1.6.13-3GboCmnxCZ4BmbYwVaL4sN) ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) ghc-prof(xml-conduit-1.9.1.2-EG4w0oWu477B6XYo8w0Zz4)"

inherit rpm
