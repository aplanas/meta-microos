SUMMARY = "Haskell feed profiling library"
DESCRIPTION = "This package provides the Haskell feed profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.1"

RPM_NAME = "ghc-feed-prof-1.3.2.1-3.2.aarch64.rpm"
RPM_HASH = "e1fdf329c246f83231d50400bc679ac16d18be315c9fef060d662b148c63d1cfa447f9a2309e34b8979e66b4626e25d7781bf6513d2d390c9cf6999dbdc925b9"

RPROVIDES:${PN} += "ghc-feed-prof \
ghc-prof-feed-1.3.2.1-3FVRlo91Va99mkl0BpW5LE"

RDEPENDS:${PN} += "ghc-feed-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-base-compat-0.13.0-Cvz3167VMpo6rdOohSlum3 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-old-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR \
ghc-prof-old-time-1.1.0.3-6MrxIvEBZcaI0p7TDiYNU1 \
ghc-prof-safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-time-locale-compat-0.1.1.5-4KOdffkWEDD5CJkcMekvXY \
ghc-prof-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
ghc-prof-xml-conduit-1.9.1.3-JDYavYDcwLN29rDQLTOOon \
ghc-prof-xml-types-0.3.8-7guWdy0cJxZLf8pjB1j9Fb"

inherit rpm
