SUMMARY = "Haskell pandoc-server profiling library"
DESCRIPTION = "This package provides the Haskell pandoc-server profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.1"

RPM_NAME = "ghc-pandoc-server-prof-0.1-1.5.aarch64.rpm"
RPM_HASH = "e2e839bb616df32fe40986cb82cab2959fa33280c49860974f9ef658a604a590ba41ec258d554e07d2fe778d2f15d54f5848d81f9a83fa41c899b7bd8e46f1da"

RPROVIDES:${PN} += "ghc-pandoc-server-prof \
ghc-pandoc-server-prof(aarch-64) \
ghc-prof(pandoc-server-0.1-6D1bWRrxol13l7SXQDdSda)"

RDEPENDS:${PN} += "ghc-pandoc-server-devel \
ghc-prof(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-prof(base-4.17.1.0) \
ghc-prof(base64-0.4.2.4-A6ZHULO0U6jEqaRLwqb1vV) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy) \
ghc-prof(doctemplates-0.11-BPgXv8g09ry9FVnSp2Q4Ny) \
ghc-prof(pandoc-3.1.2-4COa82weJXB97OkqjDlb3I) \
ghc-prof(pandoc-types-1.23-EFziwPO22I72D2SxHphq63) \
ghc-prof(servant-server-0.19.2-JqERhBhwGZn1ju7NrrjU2W) \
ghc-prof(skylighting-0.13.2.1-BFihQrd5v8J7nFEx17mOBW) \
ghc-prof(text-2.0.2) \
ghc-prof(unicode-collation-0.1.3.4-LMKRbY0RRBBKxwMiir45sP) \
ghc-prof(wai-3.2.3-LsLg4DRwusRI7b3SRdjDzn) \
ghc-prof(wai-cors-0.2.7-CSepwpjFO1f9DnlkYc71mV)"

inherit rpm
