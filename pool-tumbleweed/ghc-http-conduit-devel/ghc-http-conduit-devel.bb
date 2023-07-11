SUMMARY = "Haskell http-conduit library development files"
DESCRIPTION = "This package provides the Haskell http-conduit library development files."
LICENSE = "BSD-2-Clause"

PV = "2.3.8.2"

RPM_NAME = "ghc-http-conduit-devel-2.3.8.2-1.2.aarch64.rpm"
RPM_HASH = "d5c79abfc7a7b92cbbc2ea7c78f31ed10d47964861d24e4262f5cd085acbc5f50212b303486edb114b675b039f8dea1d709d915ccde427a6233eceb1fbddfe5a"

RPROVIDES:${PN} += "ghc-devel-http-conduit-2.3.8.2-8tllEf20Pfc53Ypql5ryYG \
ghc-http-conduit-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-devel-conduit-extra-1.3.6-1ns4btxv78gDsSQyRueTL2 \
ghc-devel-http-client-0.7.13.1-LvoiBjsIce7LUIKGveF6IJ \
ghc-devel-http-client-tls-0.3.6.1-JGexjE6a1aDBtZfhjHdqL7 \
ghc-devel-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-devel-mtl-2.2.2 \
ghc-devel-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj \
ghc-http-conduit"

inherit rpm
