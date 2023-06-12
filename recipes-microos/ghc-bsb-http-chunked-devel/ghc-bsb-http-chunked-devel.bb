SUMMARY = "Haskell bsb-http-chunked library development files"
DESCRIPTION = "This package provides the Haskell bsb-http-chunked library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.0.0.4"

RPM_NAME = "ghc-bsb-http-chunked-devel-0.0.0.4-6.2.aarch64.rpm"
RPM_HASH = "69d63a5fe27666b146e09cb9235340ee05dd53036db84dbee5c467ef2095521369c8e4f7688477be06ca4f241e27d68b70f3ccc5849f65abce0ed86e89675a41"

RPROVIDES:${PN} += "ghc-bsb-http-chunked-devel \
ghc-bsb-http-chunked-devel(aarch-64) \
ghc-devel(bsb-http-chunked-0.0.0.4-7TdDxnBU7De3tUquWdckvl)"
RDEPENDS:${PN} += "/bin/sh \
ghc-bsb-http-chunked \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0)"

inherit rpm
