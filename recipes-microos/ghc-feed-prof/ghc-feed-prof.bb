SUMMARY = "Haskell feed profiling library"
DESCRIPTION = "This package provides the Haskell feed profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.1"

RPM_NAME = "ghc-feed-prof-1.3.2.1-2.4.aarch64.rpm"
RPM_HASH = "67bdf6178efa05bf2a8957b6ad882ed5d668ee1c697727e7d9fcfbdb69b389a4d6e547823cd3025d1e244b9dd28b3358aad51c689271e8163e1dd5df1666bff5"

RPROVIDES:${PN} += "ghc-feed-prof ghc-feed-prof(aarch-64) ghc-prof(feed-1.3.2.1-9QdnKoSJqFXKInoiUUJDkf)"
RDEPENDS:${PN} += "ghc-feed-devel ghc-prof(base-4.17.1.0) ghc-prof(base-compat-0.12.2-L1DEOlMQJOdFOKsjHoWYov) ghc-prof(bytestring-0.11.4.0) ghc-prof(old-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR) ghc-prof(old-time-1.1.0.3-6MrxIvEBZcaI0p7TDiYNU1) ghc-prof(safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds) ghc-prof(text-2.0.2) ghc-prof(time-1.12.2) ghc-prof(time-locale-compat-0.1.1.5-4KOdffkWEDD5CJkcMekvXY) ghc-prof(utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q) ghc-prof(xml-conduit-1.9.1.2-EG4w0oWu477B6XYo8w0Zz4) ghc-prof(xml-types-0.3.8-7guWdy0cJxZLf8pjB1j9Fb)"

inherit rpm
