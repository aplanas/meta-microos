SUMMARY = "Haskell pandoc-server library development files"
DESCRIPTION = "This package provides the Haskell pandoc-server library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.1"

RPM_NAME = "ghc-pandoc-server-devel-0.1-1.5.aarch64.rpm"
RPM_HASH = "4aea48004f19d8c44d092723509847f41e98f220d1f3c43e317d0eb512dd64dc3cf18a6a2554711f36c72e61ebccf6d0e828fa1520575140fa9003f7cbccecc6"

RPROVIDES:${PN} += "ghc-devel(pandoc-server-0.1-6D1bWRrxol13l7SXQDdSda) ghc-pandoc-server-devel ghc-pandoc-server-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) ghc-devel(base-4.17.1.0) ghc-devel(base64-0.4.2.4-A6ZHULO0U6jEqaRLwqb1vV) ghc-devel(bytestring-0.11.4.0) ghc-devel(containers-0.6.7) ghc-devel(data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy) ghc-devel(doctemplates-0.11-BPgXv8g09ry9FVnSp2Q4Ny) ghc-devel(pandoc-3.1.2-4COa82weJXB97OkqjDlb3I) ghc-devel(pandoc-types-1.23-EFziwPO22I72D2SxHphq63) ghc-devel(servant-server-0.19.2-JqERhBhwGZn1ju7NrrjU2W) ghc-devel(skylighting-0.13.2.1-BFihQrd5v8J7nFEx17mOBW) ghc-devel(text-2.0.2) ghc-devel(unicode-collation-0.1.3.4-LMKRbY0RRBBKxwMiir45sP) ghc-devel(wai-3.2.3-LsLg4DRwusRI7b3SRdjDzn) ghc-devel(wai-cors-0.2.7-CSepwpjFO1f9DnlkYc71mV) ghc-pandoc-server"

inherit rpm
