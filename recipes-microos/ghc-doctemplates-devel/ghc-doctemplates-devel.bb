SUMMARY = "Haskell doctemplates library development files"
DESCRIPTION = "This package provides the Haskell doctemplates library development files."
LICENSE = "BSD-3-Clause"

PV = "0.11"

RPM_NAME = "ghc-doctemplates-devel-0.11-1.2.aarch64.rpm"
RPM_HASH = "eb7e99c7882a28e89e14c6ef5ce821a7116c7a78b0740cf73a5b4158b7c80db3aa7c1d23ae39bccf05d1b5a14779879e2f5a254f5e6405a05d7de0671b3e4598"

RPROVIDES:${PN} += "ghc-devel(doctemplates-0.11-BPgXv8g09ry9FVnSp2Q4Ny) \
ghc-doctemplates-devel \
ghc-doctemplates-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-devel(base-4.17.1.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(doclayout-0.4.0.1-9Y8Rw4EdBjz2IhzjzOiBy0) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(mtl-2.2.2) \
ghc-devel(parsec-3.1.16.1) \
ghc-devel(safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds) \
ghc-devel(scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1) \
ghc-devel(text-2.0.2) \
ghc-devel(text-conversions-0.3.1.1-CkkBRqT3R5g4PO0QywmUQS) \
ghc-devel(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) \
ghc-doctemplates"

inherit rpm
