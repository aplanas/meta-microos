SUMMARY = "Haskell base-compat-batteries library development files"
DESCRIPTION = "This package provides the Haskell base-compat-batteries library development \
files."
LICENSE = "MIT"

PV = "0.12.2"

RPM_NAME = "ghc-base-compat-batteries-devel-0.12.2-2.3.aarch64.rpm"
RPM_HASH = "28c2a62e2dd2e023fabaa0d1f5397384b53f29f6c07694584855fc3318ae81c562ebc9bbf19ea41337d298116af9ddf41af2daafd3df3137b50f2c145fb2f512"

RPROVIDES:${PN} += "ghc-base-compat-batteries-devel \
ghc-devel-base-compat-batteries-0.12.2-2nfbI7WkA2cAAItUqSu6Dy"

RDEPENDS:${PN} += "/bin/sh \
ghc-base-compat-batteries \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-compat-0.12.2-L1DEOlMQJOdFOKsjHoWYov \
ghc-devel-ghc-prim-0.9.0"

inherit rpm
