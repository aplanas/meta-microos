SUMMARY = "Haskell githash profiling library"
DESCRIPTION = "This package provides the Haskell githash profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.6.3"

RPM_NAME = "ghc-githash-prof-0.1.6.3-2.3.aarch64.rpm"
RPM_HASH = "3f3f9bd62210e9627ffc1c01f9d4ba3f3edd627269ff7058a44be2e7dae059d99696ce7a85f62db4fbcc14baab068326520d66edfa41a07f55420d63a773548a"

RPROVIDES:${PN} += "ghc-githash-prof \
ghc-githash-prof(aarch-64) \
ghc-prof(githash-0.1.6.3-FrkvdbOWDB4772dnMETpxS)"
RDEPENDS:${PN} += "ghc-githash-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(directory-1.3.7.1) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(process-1.6.16.0) \
ghc-prof(template-haskell-2.19.0.0) \
ghc-prof(th-compat-0.1.4-Bzk38miPOyTJh1KMkOoOkv)"

inherit rpm
