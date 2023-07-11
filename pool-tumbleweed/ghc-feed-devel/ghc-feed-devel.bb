SUMMARY = "Haskell feed library development files"
DESCRIPTION = "This package provides the Haskell feed library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.1"

RPM_NAME = "ghc-feed-devel-1.3.2.1-3.2.aarch64.rpm"
RPM_HASH = "f711923048d57ff7db9137729538caf883e61d41af9fc5272e618f914e81aba4a3ed5d529966238bb889e63db4a83ce78043ac3a70ef1b86ca0f853ced59643b"

RPROVIDES:${PN} += "ghc-devel-feed-1.3.2.1-3FVRlo91Va99mkl0BpW5LE \
ghc-feed-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-compat-0.13.0-Cvz3167VMpo6rdOohSlum3 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-old-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR \
ghc-devel-old-time-1.1.0.3-6MrxIvEBZcaI0p7TDiYNU1 \
ghc-devel-safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-time-locale-compat-0.1.1.5-4KOdffkWEDD5CJkcMekvXY \
ghc-devel-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
ghc-devel-xml-conduit-1.9.1.3-JDYavYDcwLN29rDQLTOOon \
ghc-devel-xml-types-0.3.8-7guWdy0cJxZLf8pjB1j9Fb \
ghc-feed"

inherit rpm
