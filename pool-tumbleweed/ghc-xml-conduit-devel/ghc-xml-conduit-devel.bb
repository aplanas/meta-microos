SUMMARY = "Haskell xml-conduit library development files"
DESCRIPTION = "This package provides the Haskell xml-conduit library development files."
LICENSE = "MIT"

PV = "1.9.1.3"

RPM_NAME = "ghc-xml-conduit-devel-1.9.1.3-1.2.aarch64.rpm"
RPM_HASH = "b87903d605a6e8070b2ecfd273b04b0e49fdccb302056096775b7d63afad5e036553b5e243f130d31244830270bdc5f54ac389bbf3f625a7ad227114e66e598c"

RPROVIDES:${PN} += "ghc-devel-xml-conduit-1.9.1.3-JDYavYDcwLN29rDQLTOOon \
ghc-xml-conduit-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR \
ghc-devel-blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-devel-conduit-extra-1.3.6-1ns4btxv78gDsSQyRueTL2 \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-xml-types-0.3.8-7guWdy0cJxZLf8pjB1j9Fb \
ghc-xml-conduit"

inherit rpm
