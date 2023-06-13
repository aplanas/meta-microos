SUMMARY = "Haskell x509-store library development files"
DESCRIPTION = "This package provides the Haskell x509-store library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6.9"

RPM_NAME = "ghc-x509-store-devel-1.6.9-2.3.aarch64.rpm"
RPM_HASH = "8ff0d68c382af6d764ca0b4d87ec469a5f55c6fdacb387719e6a8ba9b5880e2e0b39f6a22e7f16fcdc5fba61383c2b4abdb6b5975bda100db35e6d157fef9357"

RPROVIDES:${PN} += "ghc-devel(x509-store-1.6.9-A3hCCAbvLt52rXl7zDFmSt) \
ghc-x509-store-devel \
ghc-x509-store-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(asn1-encoding-0.9.6-Hputs8NTOGr9EmEd7QDXHk) \
ghc-devel(asn1-types-0.3.4-GYlFjiH4jmgJII5TgUQfXm) \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(cryptonite-0.30-AbDFzA14dNKDfU9pLpBLye) \
ghc-devel(directory-1.3.7.1) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(mtl-2.2.2) \
ghc-devel(pem-0.2.4-GVwv4fsQYoEEDbQiUNwxns) \
ghc-devel(x509-1.7.7-6vFRDfbnKcXIbE0ZlEHitw) \
ghc-x509-store"

inherit rpm
