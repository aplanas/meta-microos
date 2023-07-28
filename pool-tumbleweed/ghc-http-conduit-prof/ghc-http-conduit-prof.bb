SUMMARY = "Haskell http-conduit profiling library"
DESCRIPTION = "This package provides the Haskell http-conduit profiling library."
LICENSE = "BSD-2-Clause"

PV = "2.3.8.2"

RPM_NAME = "ghc-http-conduit-prof-2.3.8.2-2.1.aarch64.rpm"
RPM_HASH = "f35d8fde5c4249c774fcc305efb4eee756b068d97cb6864aa258a1fe389ed7ee7698d69951c5ae58045bee1454e977081bc1f7c10c32c5e1de2788372c5ef300"

RPROVIDES:${PN} += "ghc-http-conduit-prof \
ghc-prof-http-conduit-2.3.8.2-8tllEf20Pfc53Ypql5ryYG"

RDEPENDS:${PN} += "ghc-http-conduit-devel \
ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-prof-conduit-extra-1.3.6-1ns4btxv78gDsSQyRueTL2 \
ghc-prof-http-client-0.7.13.1-LvoiBjsIce7LUIKGveF6IJ \
ghc-prof-http-client-tls-0.3.6.1-JGexjE6a1aDBtZfhjHdqL7 \
ghc-prof-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-prof-mtl-2.2.2 \
ghc-prof-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj"

inherit rpm
