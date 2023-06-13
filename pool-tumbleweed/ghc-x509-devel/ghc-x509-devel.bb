SUMMARY = "Haskell x509 library development files"
DESCRIPTION = "This package provides the Haskell x509 library development files."
LICENSE = "BSD-3-Clause"

PV = "1.7.7"

RPM_NAME = "ghc-x509-devel-1.7.7-2.3.aarch64.rpm"
RPM_HASH = "58bf54891f5e32d317033011b1ebda08aa8338ca352d9d9d18cfc1b847c29eb2ff8bd48fb222dfaddeb5bb3f0c5003a806e59dcc4d1f2e38683ba69e2610a249"

RPROVIDES:${PN} += "ghc-devel(x509-1.7.7-6vFRDfbnKcXIbE0ZlEHitw) \
ghc-x509-devel \
ghc-x509-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(asn1-encoding-0.9.6-Hputs8NTOGr9EmEd7QDXHk) \
ghc-devel(asn1-parse-0.9.5-EPDirjvv9Ch16KeQVAexUV) \
ghc-devel(asn1-types-0.3.4-GYlFjiH4jmgJII5TgUQfXm) \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(cryptonite-0.30-AbDFzA14dNKDfU9pLpBLye) \
ghc-devel(hourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3) \
ghc-devel(memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL) \
ghc-devel(pem-0.2.4-GVwv4fsQYoEEDbQiUNwxns) \
ghc-devel(transformers-0.5.6.2) \
ghc-x509"

inherit rpm
