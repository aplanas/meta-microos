SUMMARY = "Haskell tls profiling library"
DESCRIPTION = "This package provides the Haskell tls profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "ghc-tls-prof-1.6.0-2.3.aarch64.rpm"
RPM_HASH = "458ab398705f025542804bc7e859dee110cc9dbe851b026c0b5f9d9c83febcb457557ea1da5ee373addaab6210f7e43b84a95a71a44a5cd9d6036d541335a64e"

RPROVIDES:${PN} += "ghc-prof-tls-1.6.0-48osxqPawrs8SblkErmTaM \
ghc-tls-prof"

RDEPENDS:${PN} += "ghc-prof-asn1-encoding-0.9.6-Hputs8NTOGr9EmEd7QDXHk \
ghc-prof-asn1-types-0.3.4-GYlFjiH4jmgJII5TgUQfXm \
ghc-prof-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f \
ghc-prof-cryptonite-0.30-AbDFzA14dNKDfU9pLpBLye \
ghc-prof-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-prof-hourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3 \
ghc-prof-memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL \
ghc-prof-mtl-2.2.2 \
ghc-prof-network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-x509-1.7.7-6vFRDfbnKcXIbE0ZlEHitw \
ghc-prof-x509-store-1.6.9-A3hCCAbvLt52rXl7zDFmSt \
ghc-prof-x509-validation-1.6.12-JQgBIAyKHQDDBxJK8FYPfO \
ghc-tls-devel"

inherit rpm
