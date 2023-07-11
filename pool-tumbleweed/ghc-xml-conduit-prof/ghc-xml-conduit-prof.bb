SUMMARY = "Haskell xml-conduit profiling library"
DESCRIPTION = "This package provides the Haskell xml-conduit profiling library."
LICENSE = "MIT"

PV = "1.9.1.3"

RPM_NAME = "ghc-xml-conduit-prof-1.9.1.3-1.2.aarch64.rpm"
RPM_HASH = "27e529c662b8bb7155279ccd19fd5573951aa2d162d547ba995d3514d5bf5a0ff7a5b5fb9b6500cc934f3c63d38c73ab213901785db975b55d64f4a87c065182"

RPROVIDES:${PN} += "ghc-prof-xml-conduit-1.9.1.3-JDYavYDcwLN29rDQLTOOon \
ghc-xml-conduit-prof"

RDEPENDS:${PN} += "ghc-prof-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR \
ghc-prof-blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-prof-conduit-extra-1.3.6-1ns4btxv78gDsSQyRueTL2 \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-xml-types-0.3.8-7guWdy0cJxZLf8pjB1j9Fb \
ghc-xml-conduit-devel"

inherit rpm
