SUMMARY = "Haskell cassava-megaparsec library development files"
DESCRIPTION = "This package provides the Haskell cassava-megaparsec library development \
files."
LICENSE = "MIT"

PV = "2.0.4"

RPM_NAME = "ghc-cassava-megaparsec-devel-2.0.4-3.2.aarch64.rpm"
RPM_HASH = "56b68ac17832ccb0d569f821bd74cbbf7cf22d099adf69c3b931870a5feab7c572254614898b0d1f31029018d76da26180f1f96d7c4403db9261db14dcba988c"

RPROVIDES:${PN} += "ghc-cassava-megaparsec-devel ghc-cassava-megaparsec-devel(aarch-64) ghc-devel(cassava-megaparsec-2.0.4-2pnivL0ArW7GGP4dYCJwT3)"
RDEPENDS:${PN} += "/bin/sh ghc-cassava-megaparsec ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(bytestring-0.11.4.0) ghc-devel(cassava-0.5.3.0-6nKMpykUjDPH1yduUJ1iAD) ghc-devel(megaparsec-9.3.0-9LuWCOgzW7qD3PYWTEm9Pv) ghc-devel(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) ghc-devel(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp)"

inherit rpm
