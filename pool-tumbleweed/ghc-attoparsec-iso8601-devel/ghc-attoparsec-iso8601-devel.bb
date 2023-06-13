SUMMARY = "Haskell attoparsec-iso8601 library development files"
DESCRIPTION = "This package provides the Haskell attoparsec-iso8601 library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.1.0.0"

RPM_NAME = "ghc-attoparsec-iso8601-devel-1.1.0.0-2.2.aarch64.rpm"
RPM_HASH = "4a53fb24ebc1d0f463ab63384f55bd4c696adf03dafcc1b2b36b0244e110e231704cadf235a0499535837b8a2dab65f45a7ce63ba16ef99d246df7ae63ad02b4"

RPROVIDES:${PN} += "ghc-attoparsec-iso8601-devel \
ghc-attoparsec-iso8601-devel(aarch-64) \
ghc-devel(attoparsec-iso8601-1.1.0.0-2S5wwgpuLNfEy2BIFZOtUU)"

RDEPENDS:${PN} += "/bin/sh \
ghc-attoparsec-iso8601 \
ghc-compiler \
ghc-devel(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) \
ghc-devel(base-4.17.1.0) \
ghc-devel(base-compat-batteries-0.12.2-2nfbI7WkA2cAAItUqSu6Dy) \
ghc-devel(text-2.0.2) \
ghc-devel(time-1.12.2) \
ghc-devel(time-compat-1.9.6.1-2Pu0F2MmAuC1LEapOv1K82)"

inherit rpm
