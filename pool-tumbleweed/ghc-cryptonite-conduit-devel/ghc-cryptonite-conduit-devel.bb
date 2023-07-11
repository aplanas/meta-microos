SUMMARY = "Haskell cryptonite-conduit library development files"
DESCRIPTION = "This package provides the Haskell cryptonite-conduit library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "ghc-cryptonite-conduit-devel-0.2.2-9.4.aarch64.rpm"
RPM_HASH = "e66ad1b1fc6b95c83021c94b08fafb96f766e032edbf20b416f70bea38baa818891ef4e9e638bfb0d7fa9f4a376526517eba6ad34a333de34eb869e0dbb4eaeb"

RPROVIDES:${PN} += "ghc-cryptonite-conduit-devel \
ghc-devel-cryptonite-conduit-0.2.2-KLKIUqp436hDQelLp9gzMp"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-cryptonite-conduit \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-devel-conduit-extra-1.3.6-1ns4btxv78gDsSQyRueTL2 \
ghc-devel-cryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ \
ghc-devel-exceptions-0.10.5 \
ghc-devel-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp \
ghc-devel-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-devel-transformers-0.5.6.2"

inherit rpm
