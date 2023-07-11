SUMMARY = "Haskell criterion-measurement profiling library"
DESCRIPTION = "This package provides the Haskell criterion-measurement profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.0"

RPM_NAME = "ghc-criterion-measurement-prof-0.2.1.0-1.4.aarch64.rpm"
RPM_HASH = "3509ec12a65be79ad3a6b9a726ab9886e024f9abe2a9cf31165abeaaf3f937f25bcb39e3ca80e781774dc80b899d7eacd2819adc1ef5a646c39755dc2472dd93"

RPROVIDES:${PN} += "ghc-criterion-measurement-prof \
ghc-prof-criterion-measurement-0.2.1.0-DbdcwZpcXTnArPRmwcriLh"

RDEPENDS:${PN} += "ghc-criterion-measurement-devel \
ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-base-4.17.1.0 \
ghc-prof-base-compat-0.13.0-Cvz3167VMpo6rdOohSlum3 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm
