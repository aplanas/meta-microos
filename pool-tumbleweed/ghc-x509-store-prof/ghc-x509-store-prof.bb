SUMMARY = "Haskell x509-store profiling library"
DESCRIPTION = "This package provides the Haskell x509-store profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6.9"

RPM_NAME = "ghc-x509-store-prof-1.6.9-2.3.aarch64.rpm"
RPM_HASH = "a8737e1a65fd9f4ec813ca6a01f45a7ec89be414ba35d609055cfa9d9ae2b0de48a38a9e400e8e89aa13d738fd260fc7b49e0dc8dfe8501e0d5e2abd0866b4c3"

RPROVIDES:${PN} += "ghc-prof(x509-store-1.6.9-A3hCCAbvLt52rXl7zDFmSt) \
ghc-x509-store-prof \
ghc-x509-store-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(asn1-encoding-0.9.6-Hputs8NTOGr9EmEd7QDXHk) \
ghc-prof(asn1-types-0.3.4-GYlFjiH4jmgJII5TgUQfXm) \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(cryptonite-0.30-AbDFzA14dNKDfU9pLpBLye) \
ghc-prof(directory-1.3.7.1) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(mtl-2.2.2) \
ghc-prof(pem-0.2.4-GVwv4fsQYoEEDbQiUNwxns) \
ghc-prof(x509-1.7.7-6vFRDfbnKcXIbE0ZlEHitw) \
ghc-x509-store-devel"

inherit rpm
